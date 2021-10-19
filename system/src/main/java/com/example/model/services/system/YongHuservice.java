package com.example.model.services.system;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.model.dao.system.YongHuDao;
import com.example.model.dao.system.YuanGoDao;
import com.pojos.system.YongHu;
import com.pojos.system.YuanGo;
import com.util.Password;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class YongHuservice {
    @Resource
    YongHuDao yongHuDao;
    @Resource
    YuanGoDao yuanGoDao;
    /**
     * 根据ID查询用户
     * @param yongHu
     * @return
     */
    public YuanGo getyh(YongHu yongHu){
        //验证密码
        YongHu yongHu2 = yongHuDao.selectOne(new QueryWrapper<YongHu>().eq("yg_id", yongHu.getYgId()));
        boolean dl=false;
        if (yongHu2!=null){
            try {
                String decrypt = Password.decrypt(yongHu2.getYhMm(), yongHu2.getYhKey());
                dl=decrypt.equals(yongHu.getYhMm());
                System.err.println("解密后的密码"+decrypt+"传进来的密码"+yongHu+dl);
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("密码解密错误");
            }

            if (dl){
                //查询员工
                YuanGo yuanGo = yuanGoDao.selectById(yongHu2.getYgId());
                return yuanGo;
            }
        }
        return null;
    }

    /**
     * 根据用户ID修改用户密码
     * @param yongHu
     * @return
     */
    public int updateyh(YongHu yongHu){
        return yongHuDao.updateById(yongHu);
    }

    /**
     *重置密码
     */
    public int czmm(YongHu yongHu){
//        先删除用户
        deleteyh(yongHu.getYhId()+"");
//        在新增用户
        return insertyh(yongHu);
    }

    /**
     * 根据ID删除用户
     * @param id
     * @return
     */
    public int deleteyh(String id){
        return yongHuDao.deleteById(id);
    }

    /**
     * 新增用户
     * @param yongHu
     * @return
     */
    public int insertyh(YongHu yongHu){
 //        随机生成密码键
        yongHu.setYhKey(Password.generateShortUuid());
//        将密码加密存进数据库
        try {
            yongHu.setYhMm(Password.encrypt("aaaaa",yongHu.getYhKey()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return yongHuDao.insert(yongHu);
    }

    /**
     * 用户修改密码
     * @param yongHu
     */
    public int xgmm(YongHu yongHu) {
        YongHu yh2=new YongHu();
        yh2.setYhMm(yongHu.getYhKey()).setYgId(yongHu.getYgId());
        //验证密码
        if(getyh(yh2)==null){
            return 0;
        };
        //        随机生成密码键
        yongHu.setYhKey(Password.generateShortUuid());
//        将密码加密存进数据库
        try {
            //将用户的密码取出来，加密后存进数据库
            yongHu.setYhMm(Password.encrypt(yongHu.getYhMm(),yongHu.getYhKey()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a=yongHuDao.update(yongHu,new QueryWrapper<YongHu>().eq("yg_id", yongHu.getYgId()));
        return a;
    }
}

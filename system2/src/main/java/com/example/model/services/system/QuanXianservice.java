package com.example.model.services.system;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.model.dao.system.GwQxDao;
import com.example.model.dao.system.QuanXianDao;
import com.pojos.system.QuanXian;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 07月22日16:54
 */
@Service
public class QuanXianservice {
    @Resource
    QuanXianDao quanXianDao;
    @Resource
    GwQxDao gwQxDao;

    /**
     * 查询权限
     * @return
     */
    public List<QuanXian> getqx(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.isNull("parent_id");
        List<QuanXian> list = quanXianDao.selectList(queryWrapper);
        for (QuanXian quanXian : list) {
            quanXian.setQuanXianList(getqx2(quanXian.getQxId()+""));
        }
        return list;
    }

    public List<QuanXian> getqx2(String param){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("parent_id",param);
        List<QuanXian> list = quanXianDao.selectList(queryWrapper);
        for (QuanXian quanXian : list) {
            quanXian.setQuanXianList(getqx2(quanXian.getQxId()+""));
        }
        return list;
    }

    /**
     * 根据岗位获取对应的权限
     * @param gwId
     * @return
     */
    public List<QuanXian> router(String gwId) {
        return quanXianDao.router(gwId);
    }
}

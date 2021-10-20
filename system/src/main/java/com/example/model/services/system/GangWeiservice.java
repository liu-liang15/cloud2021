package com.example.model.services.system;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.model.dao.system.GangWeiDao;
import com.example.model.dao.system.GwQxDao;
import com.pojos.system.GangWei;
import com.pojos.system.GwQx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GangWeiservice {
    @Resource
    GangWeiDao gangWeiDao;
    @Resource
    GwQxDao gwQxDao;

//    获取全部岗位
    public List<GangWei> getgw(String param){
            QueryWrapper<GangWei> queryWrapper = new QueryWrapper<GangWei>();
            queryWrapper.like("gw_name",param);
        return gangWeiDao.selectList(param==null?null:queryWrapper);
    }
//    分层查询岗位
    public List<GangWei> getfcgw(){
//        条件构造器
        QueryWrapper<GangWei> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("parent_id").or().eq("parent_id","");
//        根据条件构造器查询顶级岗位
        List<GangWei> gangWeis = gangWeiDao.selectList(queryWrapper);
//        查询岗位对应的权限
        for (GangWei gangWei : gangWeis) {
//           查询岗位对应的权限集合《中间表》
            List<GwQx> gwqxs = gwQxDao.selectList(new QueryWrapper<GwQx>().eq("gw_id", gangWei.getGwId()));
            gangWei.setGwQxes(gwqxs);
//            启动递归，查询岗位的下级
            gangWei.setListgw(getgw2(gangWei.getGwId()+""));
        }
        return gangWeis;
    }
    public List<GangWei> getgw2(String parentId){
        QueryWrapper<GangWei> queryWrapper =new QueryWrapper<>();
        queryWrapper.eq("Parent_id",parentId);
        List<GangWei> list = gangWeiDao.selectList(queryWrapper);
        for (GangWei gangWei : list) {
            //           查询岗位对应的权限集合《中间表》
            List<GwQx> gwqxs = gwQxDao.selectList(new QueryWrapper<GwQx>().eq("gw_id", gangWei.getGwId()));
            gangWei.setGwQxes(gwqxs);
            //            查询岗位的下级
            gangWei.setListgw(getgw2(gangWei.getGwId()+""));
        }
        return list;
    }

    /**
     * 新增岗位，和岗位对应的权限
     * @param gangWei
     */
    public void insertgw(GangWei gangWei) {
        int insert = gangWeiDao.insert(gangWei);
        GwQx gwQx=new GwQx();
        gwQx.setGwId(gangWei.getGwId()+"");
//       循环增加中间表
        for (String qx : gangWei.getQx()) {
            gwQx.setQxId(qx);
            gwQxDao.insert(gwQx);
        }
    }
    public void updateGw(GangWei gangWei){
//        先修改岗位表
        System.err.println("开始修改");
        int update=gangWeiDao.updateById(gangWei);
//         再修改权限，先删除这个岗位拥有的权限
        Map<String, Object> columnMap = new HashMap<String, Object>();//删除条件
        columnMap.put("gw_id",gangWei.getGwId());
        gwQxDao.deleteByMap(columnMap);//根据字段删除岗位对权限表
        //      然后在循环增加中间表
        GwQx gwQx=new GwQx();
        gwQx.setGwId(gangWei.getGwId()+"");
        for (String qx : gangWei.getQx()) {
            gwQx.setQxId(qx);
            gwQxDao.insert(gwQx);
        }



    }


}

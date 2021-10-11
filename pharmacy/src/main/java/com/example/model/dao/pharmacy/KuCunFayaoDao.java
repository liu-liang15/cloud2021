package com.example.model.dao.pharmacy;


import com.pojos.pharmacy.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface KuCunFayaoDao {
    //查询库存
    List<YpKuCun> FindAllKuCun();
    //查询某药品库存
    List<YpKuCun> FindAllKuCun2(int drugID);
    List<YpKuCun> FindAllKuCun3();
    //新增调拨申请
    void addDBSQ(DiaoBoSq diaoBoSq);
    //新增调拨详情
    void addDBXD(Collection<DbsqXiangBiao> dbsqXiangBiaos, String dbShengQing);
    List<DiaoBoSq> findByYPSQ1();
    List<DiaoBoSq> findByYPSQ2();
    //修改申请状态
    void updateYPSQ(int sqZhuangTai,String dbShengQing);
    //新增销毁申请
    void addXHSQ(XiaoHuiSq xiaoHuiSq);
    //新增销毁详情
    void addXHXB(Collection<XiaoHuiXd> xiaoHuiXds, String xhsqId);
    //删除库存为0的库存记录
    void delectKuCun();
    //修改库存某药品数量
    void edatKcCun(int ypsl,String rkpcID);
    //新增调拨发药详情
    void addFaYaoXQ(@Param("chukuId")String chukuId,@Param("rkpcId")String rkpcId,@Param("chuKuSl")int chuKuSl);
}

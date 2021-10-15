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
    void addDBXD(@Param("dbsqXiangBiaos") Collection<DbsqXiangBiao> dbsqXiangBiaos,@Param("dbShengQing") String dbShengQing);
    List<DiaoBoSq> findByYPSQ1();
    List<DiaoBoSq> findByYPSQ2();
    //修改申请状态
    void updateYPSQ(@Param("sqZhuangTai") int sqZhuangTai,@Param("dbShengQing") String dbShengQing);
    //新增销毁申请
    void addXHSQ(XiaoHuiSq xiaoHuiSq);
    //新增销毁详情
    void addXHXB(@Param("xiaoHuiXds") Collection<XiaoHuiXd> xiaoHuiXds,@Param("xhsqId") String xhsqId);
    //删除库存为0的库存记录
    void delectKuCun();
    //修改库存某药品数量
    void edatKcCun(@Param("ypsl") int ypsl,@Param("rkpcID") String rkpcID);
    //新增调拨发药详情
    void addFaYaoXQ(@Param("chukuId")String chukuId,@Param("rkpcId")String rkpcId,@Param("chuKuSl")int chuKuSl);
}

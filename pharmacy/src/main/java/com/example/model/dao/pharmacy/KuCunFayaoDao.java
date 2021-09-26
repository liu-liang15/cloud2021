package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.*;
import org.apache.ibatis.annotations.Mapper;
import java.util.Collection;
import java.util.List;

@Mapper
public interface KuCunFayaoDao {
    List<YpKuCun> FindAllKuCun();
    List<YpKuCun> FindAllKuCun2();
    List<YpKuCun> FindAllKuCun3();
    void addDBSQ(DiaoBoSq diaoBoSq);
    void addDBXD(Collection<DbsqXiangBiao> dbsqXiangBiaos, String dbShengQing);
    List<DiaoBoSq> findByYPSQ1();
    List<DiaoBoSq> findByYPSQ2();
    void updateYPSQ(int sqZhuangTai,String dbShengQing);

    void addXHSQ(XiaoHuiSq xiaoHuiSq);
    void addXHXB(Collection<XiaoHuiXd> xiaoHuiXds, String xhsqId);
}

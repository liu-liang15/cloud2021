package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.KuCunFayaoDao;
import com.pojos.pharmacy.DiaoBoSq;
import com.pojos.pharmacy.XiaoHuiSq;
import com.pojos.pharmacy.YpKuCun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KuCunFayaoService {
    @Autowired
    KuCunFayaoDao kuCunFayaoDao;
    public List<YpKuCun> FindAllKuCun(){
        return kuCunFayaoDao.FindAllKuCun();
    }
    public List<YpKuCun> FindAllKuCun2(){
        return kuCunFayaoDao.FindAllKuCun2();
    }
    public List<YpKuCun> FindAllKuCun3(){
        return kuCunFayaoDao.FindAllKuCun3();
    }

    public void addYPDB(DiaoBoSq diaoBoSq){
        kuCunFayaoDao.addDBSQ(diaoBoSq);
        kuCunFayaoDao.addDBXD(diaoBoSq.getDbsqXiangBiaos(),diaoBoSq.getDbShengQing());
    }

    public void addXHSQ(XiaoHuiSq xiaoHuiSq){
        kuCunFayaoDao.addXHSQ(xiaoHuiSq);
        kuCunFayaoDao.addXHXB(xiaoHuiSq.getXiaoHuiXds(),xiaoHuiSq.getXhsqId());
    }

    public List<DiaoBoSq> findByYPSQ1(){
        return kuCunFayaoDao.findByYPSQ1();
    }

    public List<DiaoBoSq> findByYPSQ2(){
        return kuCunFayaoDao.findByYPSQ2();
    }

    public void updateYPSQ(int sqZhuangTai,String dbShengQing){
        kuCunFayaoDao.updateYPSQ(sqZhuangTai,dbShengQing);
    }



   /* public void addChuKu(ChuKu chuKu){
        List<YpKuCun> kuCuns= kuCunFayaoDao.FindAllKuCun2();
        List<DbsqXiangBiao> dbsqXiangBiaos= chuKu.get

        for(int i=0;i<chuKuJiLu.size();i++){
                chuKuJiLu.get(i).get

        }
    }*/
}

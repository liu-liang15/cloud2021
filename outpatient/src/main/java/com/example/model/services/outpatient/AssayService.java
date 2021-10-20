package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.AssayDao;
import com.example.model.dao.outpatient.PayfeesDao;
import com.pojos.outpatient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AssayService {
    @Autowired
    AssayDao assayDao;
    @Autowired
    PayfeesDao payfeesDao;
    /*新增检验处方单*/
    public void insertAssayCF(Assay assay){
        assayDao.insertAssayCF(assay);
    }

    /*循环新增检验处方详单*/
    public void insertLabworkdetailsCF(List<Labworkdetails> list, String assayNo){
        for(Labworkdetails p : list){
            p.setLabdetAssayNo(assayNo);
            p.setLabdetCount(1);
            assayDao.insertLabworkdetailsCF(p);
        }
    }
    //根据门诊删除处方检验详单状态为1的数据
    public void deljycfddzt1(String param) {
        assayDao.deljycfddzt1(param);
    }

    /*查询检验详情状态为1的，根据门诊号*/
    public List<Labworkdetails> selectjyxqzt1(String param) {
        return assayDao.selectjyxqzt1(param);
    }

    /*查询检验订单，根据门诊号*/
    public Assay selectjydd(String param) {
        return assayDao.selectjydd(param);
    }

    /*修改处方检验订单总价格，根据门诊号*/
    public void updatecfjyddzjg(double jg, String mzhao) {
        assayDao.updatecfjyddzjg(jg,mzhao);

        payfeesDao.updatePayZtHy(mzhao,1);
    }
}

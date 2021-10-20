package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.ExamineorderDao;
import com.example.model.dao.outpatient.PayfeesDao;
import com.pojos.outpatient.Examinedetails;
import com.pojos.outpatient.Examineorder;
import com.pojos.outpatient.Labworkdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExamineorderService {
    @Autowired
    ExamineorderDao examineorderDao;
    @Autowired
    PayfeesDao payfeesDao;

    /*新增处方检查订单*/
    public void insertExamineorder(Examineorder examineorder){
        examineorderDao.insertExamineorder(examineorder);
    }

    /*循环新增处方检查详单*/
    public void insertExaminedetails(List<Labworkdetails> list, String exaordNo){
        int exaordNo1 = Integer.parseInt(exaordNo);
        for(Labworkdetails p : list){
            examineorderDao.insertExaminedetails(exaordNo1,p.getAssayMealId(),1,p.getAssayMealPrice());
        }
    }

    //根据门诊删除处方检查详单状态为1的数据
    public void deljccfddzt1(String param) {
        examineorderDao.deljccfddzt1(param);
    }

    /*查询处方检查详情状态为1，根据门诊号*/
    public List<Examinedetails> selectjcxqzt1(String param) {
        return examineorderDao.selectjcxqzt1(param);
    }

    /*查询处方检查订单，根据门诊号*/
    public Examineorder selectjcdd(String param) {
        return examineorderDao.selectjcdd(param);
    }

    /*修改处方检查订单总价格，根据门诊号*/
    public void updatecfjcddzjg(double jg, String mzhao) {
        examineorderDao.updatecfjcddzjg(jg,mzhao);
        payfeesDao.updatePayZtJc(mzhao,1);
    }
}

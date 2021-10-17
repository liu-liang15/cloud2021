package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.ExpCalDao;
import com.example.model.dao.inpatient.HosAloneDao;
import com.example.model.dao.inpatient.ResMealDao;
import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPay;
import com.pojos.inpatient.DocAdv;
import com.pojos.inpatient.ExpCal;
import com.pojos.inpatient.ResMeal;
import com.pojos.outpatient.Patient;
import com.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ResMealServer {
    @Autowired
    ResMealDao resMealDao;
    @Autowired
    ExpCalDao expCalDao;
    @Autowired
    HosAloneDao hosAloneDao;
    //新增检验
    public void addResMeal(DocAdv docAdv, List<AssayMeal> assayMeals,String docname){
        docname = docname.substring(1,docname.length()-1);
        Patient p=hosAloneDao.allHos2(docAdv.getResNo()).get(0).getAdmNot().getPat();
        for(AssayMeal a:assayMeals){
            ResMeal resMeal=new ResMeal(docAdv.getResNo(),a.getAssayMealId()+"",docAdv.getDocPer());
            ExpCal e=new ExpCal(docAdv.getResNo(),a.getAssayMealName(),a.getAssayMealPrice(),1,"化验");
            if(!"化验".equals(a.getAssayMealType())){
                e.setExpType("检查");
            }
            expCalDao.addExpCal(e);
            resMealDao.addResMeal(resMeal);


            AssayMeal assayMeal = expCalDao.selectAssayMealByName(a.getAssayMealName());
            IdWorker idWorker = new IdWorker(1,1,1);
            long tjid = idWorker.nextId();
            String ksName=assayMeal.getKsName();
            AssayPay assayPay=new AssayPay(0,tjid+"",0,a.getAssayMealPrice(),"诊疗卡",new Date(),"住院体检");
            //体检新增缴费记录
            expCalDao.tjaddjfd(assayPay);
            AssayInfo assayInfo = new AssayInfo(p.getPatientName(),p.getPatientSex(),Integer.parseInt(p.getPatientAge()),p.getPatientIdcart(),p.getPatientPhone(),new Date(),a.getAssayMealName(),docname,ksName,tjid+"",e.getExpNo(),"住院体检");
            expCalDao.inserttijgjl(assayInfo);
        }
    }

}

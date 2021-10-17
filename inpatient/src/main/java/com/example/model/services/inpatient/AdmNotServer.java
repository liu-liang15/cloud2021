package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.AdmNotDao;
import com.example.model.dao.inpatient.HosAloneDao;
import com.pojos.inpatient.AdmNot;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AdmNotServer {
    @Autowired
    AdmNotDao admNotDao;
    @Autowired
    HosAloneDao hosAloneDao;
    //查找住院通知单
    public List<AdmNot> allAdm(String params){
        return admNotDao.selAdm(params);
    }
    //修改住院通知单状态
    public void alterAdm(String hosNO){
        admNotDao.alterAdm(hosNO);
    }
    //新增住院通知单
    public String addAdm(AdmNot admNot) {
        //判断病人是否登记
        if (admNotDao.selByPatient(admNot.getPatient()).isEmpty()) {
            //判断病人是否住院
            if(hosAloneDao.selByPatient(admNot.getPatient()).isEmpty()){
                //新增住院
                admNotDao.addAdm(admNot);
                return "ok";
            }
            return "false1";
        }else {
            return "false2";
        }
    }
}

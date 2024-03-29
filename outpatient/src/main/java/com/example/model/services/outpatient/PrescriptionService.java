package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.PrescriptionDao;
import com.pojos.outpatient.Prescription;
import com.pojos.outpatient.Prescriptiondetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PrescriptionService {
    @Autowired
    PrescriptionDao prescriptionDao;

    public void insertChufang(Prescription p){
        prescriptionDao.insertChufang(p);
    }

    public void insertChufangXQ(List<Prescriptiondetails> list, String predetPresNo){
        for(Prescriptiondetails p : list){
            p.setPredetPresNo(predetPresNo);
            Double number = Double.parseDouble(p.getNumber());
            p.setXiaoji(number * p.getDrugShoujia());
            prescriptionDao.insertChufangXQ(p);
        }
    }

    //根据门诊删除处方药品详单状态为1的数据
    public void delypypddzt1(String param) {
        prescriptionDao.delypypddzt1(param);
    }

    public void updatecfypddzjg(double jg, String mzhao) {
        prescriptionDao.updatecfypddzjg(jg,mzhao);
    }

    public List<Prescriptiondetails> selectypxqzt1(String param) {
        return prescriptionDao.selectypxqzt1(param);
    }

    public Prescription selectypdd(String param) {
        return prescriptionDao.selectypdd(param);
    }
}

package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.MedicalcardztDao;
import com.pojos.outpatient.Medicalcardzt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalcardztService{
    @Autowired
    MedicalcardztDao medicalcardztDao;

    /*多条件模糊查询诊疗卡停启用记录*/
    public List<Medicalcardzt> findAllMedicalcardzt(String zlkhao,String sj1,String sj2){
        return medicalcardztDao.findAllMedicalcardzt(zlkhao,sj1,sj2);
    }

    /*新增诊疗卡停启用记录*/
    public void save(Medicalcardzt medicalcardzt) {
        medicalcardztDao.save(medicalcardzt);
    }

}

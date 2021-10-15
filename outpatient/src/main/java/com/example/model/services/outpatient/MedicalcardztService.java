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

    public List<Medicalcardzt> findAllMedicalcardzt(String zlkhao,String sj1,String sj2){
        return medicalcardztDao.findAllMedicalcardzt(zlkhao,sj1,sj2);
    }

    public void save(Medicalcardzt medicalcardzt) {
        medicalcardztDao.save(medicalcardzt);
    }

}

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

    public List<Medicalcardzt> findAllMedicalcardzt(String param){
        return medicalcardztDao.findAllMedicalcardzt(param);
    }

    public void save(Medicalcardzt medicalcardzt) {
        medicalcardztDao.save(medicalcardzt);
    }

}

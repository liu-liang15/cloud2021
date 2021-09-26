package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.MedicalcardDao;
import com.pojos.outpatient.Medicalcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalcardService {
    @Autowired
    MedicalcardDao medicalcardDao;

    public List<Medicalcard> findAllMedicalcard(String param){
        return medicalcardDao.findAllMedicalcard(param);
    }

    public List<Medicalcard> findMedicalcardByMediCard(String mediCard){
        return medicalcardDao.findMedicalcardByMediCard(mediCard);
    }

    public void  addMedicalcard(Medicalcard medicalcard){
        medicalcardDao.addMedicalcard(medicalcard);
    }

    public void medicalcardTY(int mediNo,String mediState){
        medicalcardDao.medicalcardTY(mediNo,mediState);
    }

    public void medicalcardBB(int mediNo,String mediCard){
        medicalcardDao.medicalcardBB(mediNo,mediCard);
    }

    public void editPwd(int mediNo,String mediPassword){
        medicalcardDao.editPwd(mediNo,mediPassword);
    }
}

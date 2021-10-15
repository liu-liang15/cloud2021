package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.PatientDao;
import com.pojos.outpatient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatientService {
    @Autowired
    PatientDao patientDao;

    public List<Patient> findAll(String name,String idcard,String phone,String sex){
        return patientDao.findAllPatient(name,idcard,phone,sex);
    }

    public void savePatient(Patient patient){
        if(patient.getPatientNo() == null || patient.getPatientNo() == 0){
            patientDao.insertPatient(patient);
        }else{
            patientDao.updatePatient(patient);
        }
    }
}

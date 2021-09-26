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

    public List<Patient> findAll(String param){
        System.out.println(321);
        return patientDao.findAllPatient(param);
    }

    public void savePatient(Patient patient){
        if(patient.getPatientNo() == null || patient.getPatientNo() == 0){
            patientDao.insertPatient(patient);
        }else{
            patientDao.updatePatient(patient);
        }
    }
}

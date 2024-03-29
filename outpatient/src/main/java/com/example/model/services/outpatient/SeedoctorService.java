package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.SeedoctorDao;
import com.pojos.outpatient.Seedoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SeedoctorService {
    @Autowired
    SeedoctorDao seedoctorDao;

    public void insertJiuZhenJiLu(Seedoctor seedoctor){
        seedoctorDao.insertJiuZhenJiLu(seedoctor);
    }

    public List<Seedoctor> findseedoctor(int param){
        return seedoctorDao.findseedoctor(param);
    }

}

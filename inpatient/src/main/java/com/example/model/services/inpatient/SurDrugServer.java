package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.SurDrugDao;
import com.pojos.inpatient.SurDrug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SurDrugServer {
    @Autowired
    SurDrugDao surDrugDao;
    //查看对应手术药品
    public List<SurDrug> selSurDrug(long param){
        return surDrugDao.selSurDrug(param);
    }
}

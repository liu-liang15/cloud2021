package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.AssayMealBlipDao;
import com.example.model.dao.outpatient.FeebillDao;
import com.pojos.outpatient.AssayMealBlip;
import com.pojos.outpatient.Feebill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FeebillService {
    @Autowired
    FeebillDao feebillDao;

    public List<Feebill> findAllDFYP(){
        return feebillDao.findAllDFYP();
    }
}

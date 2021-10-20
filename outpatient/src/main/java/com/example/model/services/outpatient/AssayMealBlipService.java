package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.AssayMealBlipDao;
import com.pojos.outpatient.AssayMealBlip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AssayMealBlipService {
    @Autowired
    AssayMealBlipDao assayMealBlipDao;

    /*查询所有检查项目*/
    public List<AssayMealBlip> findBlip(){
        return assayMealBlipDao.findBlip();
    }
}

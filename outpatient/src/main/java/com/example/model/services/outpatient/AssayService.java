package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.AssayDao;
import com.pojos.outpatient.Assay;
import com.pojos.outpatient.Labworkdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AssayService {
    @Autowired
    AssayDao assayDao;

    public void insertAssayCF(Assay assay){
        assayDao.insertAssayCF(assay);
    }

    public void insertLabworkdetailsCF(List<Labworkdetails> list, String assayNo){
        for(Labworkdetails p : list){
            p.setLabdetAssayNo(assayNo);
            assayDao.insertLabworkdetailsCF(p);
        }
    }
}

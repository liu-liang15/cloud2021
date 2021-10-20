package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.HospregcateDao;
import com.pojos.outpatient.Hospregcate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HospregcateService {
    @Autowired
    HospregcateDao hospregcateDao;

    /*查询挂号类型*/
    public List<Hospregcate> findAllHopregcate(){
        return hospregcateDao.findAllHopregcate();
    }
}

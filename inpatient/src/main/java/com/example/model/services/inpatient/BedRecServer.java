package com.example.model.services.inpatient;


import com.example.model.dao.inpatient.BedRecDao;
import com.pojos.inpatient.BedRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BedRecServer {
    @Autowired
    BedRecDao bedRecDao;
    //查看床位分配记录
    public List<BedRec> selBedRec(){
        return bedRecDao.selBedRec();
    }
}

package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.BedCzRecDao;
import com.pojos.inpatient.BedCzRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BedCzRecServer {
    @Autowired
    BedCzRecDao bedCzRecDao;
    //查看床位操作记录
    public List<BedCzRec> selBedCzRec(){
        return bedCzRecDao.selBedCzRec();
    }
}

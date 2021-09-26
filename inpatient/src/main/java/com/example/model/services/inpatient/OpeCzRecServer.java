package com.example.model.services.inpatient;


import com.example.model.dao.inpatient.OpeCzRecDao;
import com.pojos.inpatient.OpeCzRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OpeCzRecServer{
    @Autowired
    OpeCzRecDao opeCzRecDao;
    //查看手术室操作记录
    public List<OpeCzRec> selOpeCz(){
        return opeCzRecDao.selOpeCz();
    }
}

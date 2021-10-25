package com.example.model.services.inpatient;


import com.example.model.dao.inpatient.OpeCzRecDao;
import com.pojos.inpatient.OpeCzRec;
import org.apache.ibatis.annotations.Param;
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
    public List<OpeCzRec> selOpeCz(String opeName,String opeCztype,String opeCzTime1,String opeCzTime2){
        return opeCzRecDao.selOpeCz(opeName,opeCztype,opeCzTime1,opeCzTime2);
    }
}

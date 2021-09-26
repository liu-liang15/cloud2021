package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.AdmNotDao;
import com.example.model.dao.inpatient.HosAloneDao;
import com.pojos.inpatient.HosAlone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HosAloneServer {
    @Autowired
    HosAloneDao hosAloneDao;
    @Autowired
    AdmNotDao admNotDao;
    //查询住院单
    public List<HosAlone> allHos(String params){
        return hosAloneDao.allHos(params);
    }
    //新增住院单并修改住院通知单状态
    public void addHos(HosAlone hosAlone){
        //新增住院单
        hosAloneDao.addHos(hosAlone);
        //修改住院通知单状态
        admNotDao.alterAdm(hosAlone.getHosNo());
    }
}

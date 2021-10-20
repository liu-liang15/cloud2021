package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.CasehistoryDao;
import com.pojos.outpatient.Casehistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CasehistoryService {
    @Autowired
    CasehistoryDao casehistoryDao;

    /*新增病历*/
    public void insertBingLi(Casehistory casehistory){
        casehistoryDao.insertBingLi(casehistory);
    }

    /*查询病人病历，根据身份证号*/
    public Casehistory findCaseHistorySFZ(String param){
        return casehistoryDao.findCaseHistorySFZ(param);
    }

    /*多条件，查询病人病历*/
    public List<Casehistory> findAllCaseHistory(String name,String idcard,String phone,String sex){
        return casehistoryDao.findAllCaseHistory(name,idcard,phone,sex);
    }
}

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

    public void insertBingLi(Casehistory casehistory){
        casehistoryDao.insertBingLi(casehistory);
    }

    public Casehistory findCaseHistorySFZ(String param){
        return casehistoryDao.findCaseHistorySFZ(param);
    }

    public List<Casehistory> findAllCaseHistory(String name,String idcard,String phone,String sex){
        return casehistoryDao.findAllCaseHistory(name,idcard,phone,sex);
    }
}

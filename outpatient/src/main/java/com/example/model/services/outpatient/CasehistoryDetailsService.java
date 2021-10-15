package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.CasehistoryDetailsDao;
import com.pojos.outpatient.Casehistorydetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CasehistoryDetailsService {
    @Autowired
    CasehistoryDetailsDao casehistoryDetailsDao;

    public void insertBingLiXQ(Casehistorydetails casehistorydetails){
        casehistoryDetailsDao.insertBingLiXQ(casehistorydetails);
    }

    public List<Casehistorydetails> findCasehisDetails(int param){
        return casehistoryDetailsDao.findCasehisDetails(param);
    }
    //-- 门诊号查询就诊记录，查询病历详情
    public Casehistorydetails findCasehisDetailsBySeenumber(String param) {
        return casehistoryDetailsDao.findCasehisDetailsBySeenumber(param);
    }

    //修改诊断结果
    public void editzhenduanjieguo(String cahideZhenduanjieguo, String cahideNo) {
        casehistoryDetailsDao.editzhenduanjieguo(cahideZhenduanjieguo,cahideNo);
    }
}

package com.example.controller.outpatient;

import com.example.model.services.outpatient.CasehistoryService;
import com.pojos.outpatient.Casehistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class CasehistoryController {
    @Autowired
    CasehistoryService casehistoryService;

    //新增病人病历
    @RequestMapping("/insertBingLi")
    public int insertBingLi(String patientNo){
        int patiNo = Integer.parseInt(patientNo);
        Casehistory casehistory = new Casehistory(0,patiNo,null,null);
        casehistoryService.insertBingLi(casehistory);
        return casehistory.getCashisNo();
    }

    //根据病人编号查询病历
    @GetMapping("/findCaseHistorySFZ")
    public Casehistory findCaseHistorySFZ(String param){
        return casehistoryService.findCaseHistorySFZ(param);
    }


    //查询所有病历
    @GetMapping("/findAllCaseHistory")
    public List<Casehistory> findAllCaseHistory(String param){
        return casehistoryService.findAllCaseHistory(param);
    }

}

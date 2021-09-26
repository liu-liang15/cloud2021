package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.MedicalcardCzjlService;
import com.example.model.services.outpatient.MedicalcardService;
import com.pojos.outpatient.Medicalcardczjl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class MedicalcardCzjlController {
    @Autowired
    MedicalcardCzjlService medicalcardCzjlService;
    @Autowired
    MedicalcardService medicalcardService;


    @GetMapping("/findAllMedicalcardCzjl")
    public List<Medicalcardczjl> findAllMedicalcardCzjl(String param){
        return medicalcardCzjlService.findAllMedicalcardCzjl(param);
    }

    //新增诊疗卡
    @RequestMapping("/addMedicalcardCzjl")
    public void addMedicalcardCzjl(String Medicalcardczjl){
        System.out.println(Medicalcardczjl);

//        medicalcardService.findMedicalcardByMediCard(mediCard);
        Medicalcardczjl Medicalcardczjl1 = JSONObject.parseObject(Medicalcardczjl,Medicalcardczjl.class);
        medicalcardCzjlService.addMedicalcardCzjl(Medicalcardczjl1);
    }
}

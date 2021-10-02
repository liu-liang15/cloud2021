package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.MedicalcardCzjlService;
import com.example.model.services.outpatient.MedicalcardService;
import com.pojos.inpatient.Medicalcardjfjl;
import com.pojos.outpatient.Medicalcardczjl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //修改卡余额
    @RequestMapping("/updatepat")
    public void updatePat(@RequestBody Medicalcardjfjl med){
        System.err.println(med.getMecajfjlMoney()+"guolai修改卡余额"+Integer.parseInt(med.getMecajfjlMediNo()));
        medicalcardCzjlService.updatePat(med.getMecajfjlMoney(),Integer.parseInt(med.getMecajfjlMediNo()));
    }


}

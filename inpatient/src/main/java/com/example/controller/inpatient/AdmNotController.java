package com.example.controller.inpatient;

import com.example.model.services.inpatient.AdmNotServer;
import com.pojos.inpatient.AdmNot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class AdmNotController {
    @Autowired
    AdmNotServer admNotServer;
    //查询住院单
    @GetMapping("/adm")
    public List<AdmNot> selAdm(String param){
        return admNotServer.allAdm(param);
    }
    //新增住院通知单
    @RequestMapping("addAdm")
    public void addAdm(@RequestBody AdmNot admNot){admNotServer.addAdm(admNot);}
}

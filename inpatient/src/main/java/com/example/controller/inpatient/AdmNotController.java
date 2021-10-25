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
    //多条件查询住院通知单
    @GetMapping("selAdmByAll")
    public List<AdmNot> selAdmByAll(String name,String idcart,String hosNo,String hosTj){
        return admNotServer.selAdmByAll(name,idcart,hosNo,hosTj);
    }
    //新增住院通知单
    @RequestMapping("addAdm")
    public String addAdm(@RequestBody AdmNot admNot){return admNotServer.addAdm(admNot);}
    //新增住院通知单
    @RequestMapping("addAdm1")
    public String addAdm1(@RequestBody AdmNot admNot) {
        return admNotServer.addAdm1(admNot);
    }
}

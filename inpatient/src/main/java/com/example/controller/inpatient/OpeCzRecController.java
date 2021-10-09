package com.example.controller.inpatient;

import com.example.model.services.inpatient.OpeCzRecServer;
import com.pojos.inpatient.OpeCzRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class OpeCzRecController {
    @Autowired
    OpeCzRecServer opeCzRecServer;
    //查看手术室操作记录
    @GetMapping("/selOpeCz")
    public List<OpeCzRec> selOpeCz(){
        return opeCzRecServer.selOpeCz();
    }
}

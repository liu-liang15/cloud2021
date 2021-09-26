package com.example.controller.inpatient;

import com.example.model.services.inpatient.ExpCalServer;
import com.pojos.inpatient.ExpCal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/inpatient")
public class ExpCalController {
    @Autowired
    ExpCalServer expCalServer;
    //查看患者的消费记录
    @GetMapping("/selExpCal")
    public List<ExpCal> selExpCal(String param){
        return expCalServer.selExpCal(param);
    }
}

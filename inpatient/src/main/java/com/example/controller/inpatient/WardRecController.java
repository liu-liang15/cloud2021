package com.example.controller.inpatient;

import com.example.model.services.inpatient.WardRecServer;
import com.pojos.inpatient.WardRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class WardRecController {
    @Autowired
    WardRecServer wardRecServer;
    @GetMapping("/selWardRec")
    //查询病房修改日志
    public List<WardRec> selWardRec(String param){
        return wardRecServer.selWardRec(param);
    }
}

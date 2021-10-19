package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.services.inpatient.SurItemServer;
import com.pojos.inpatient.SurDrug;
import com.pojos.inpatient.SurItem;
import com.pojos.inpatient.SurXh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/inpatient")
public class SurItemController {
    @Autowired
    SurItemServer surItemServer;
    //新增手术
    @PostMapping("/addSur")
    public String addSur(@RequestBody SurItem surItem){
        return surItemServer.addSur(surItem);
    }
    //查看手术
    @GetMapping("/selSur")
    public List<SurItem> selSur(String param,String ksId,String surNo,String surSco){
        return surItemServer.selSur(param,ksId,surNo,surSco);
    }
    //修改手术
    @PostMapping("/upDateSur")
    public String upDateSur(@RequestBody SurItem surItem){
        return surItemServer.upDateSur(surItem);
    }
}

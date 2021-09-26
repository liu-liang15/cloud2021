package com.example.controller.outpatient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.SeedoctorService;
import com.pojos.outpatient.Seedoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class SeedoctorController {
    @Autowired
    SeedoctorService seedoctorService;

    //新增就诊记录
    @PostMapping("/insertJiuZhenJiLu")
    public int insertJiuZhenJiLu(@RequestBody Map<String,Object> map){
        String jiuzhenjiluform= JSON.toJSONString(map.get("jiuzhenjiluform"));
        Seedoctor seedoctor = JSONObject.parseObject(jiuzhenjiluform,Seedoctor.class);
        System.out.println(seedoctor);
        seedoctorService.insertJiuZhenJiLu(seedoctor);
        return seedoctor.getSeedoNo();
    }

    //查询就诊记录
    @GetMapping("/findseedoctor")
    public List<Seedoctor> findseedoctor(String param){
        int i = Integer.parseInt(param);
        return seedoctorService.findseedoctor(i);
    }

}

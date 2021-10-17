package com.example.controller.outpatient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.SeedoctorService;
import com.pojos.outpatient.Mzshoushujieguo;
import com.pojos.outpatient.Patient;
import com.pojos.outpatient.Seedoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/outpatient")
public class SeedoctorController {
    @Autowired
    SeedoctorService seedoctorService;

//    -- 根据门诊号查询门诊手术结果
//    select * from mzshoushujieguo m inner join patient p on p.patient_no = m.patient_no where m.mzhao = #{param}
        @GetMapping("/selectmzshoushujieguo")
    public List<Mzshoushujieguo> selectmzshoushujieguo(String mzhao){
        return seedoctorService.selectmzshoushujieguo(mzhao);
    }
//-- 修改门诊手术结果，根据编号
//    update mzshoushujieguo set jieguo = #{jieguo} where no = #{no}
    @RequestMapping("/updatemzshoushujieguo")
    public void updatemzshoushujieguo(String jieguo,int no){
        seedoctorService.updatemzshoushujieguo(jieguo,no);
    }

    //查询就诊记录
    @GetMapping("/selectInfoRes")
    public List<Seedoctor> selectInfoRes(String mzhao){
        return seedoctorService.selectInfoRes(mzhao);
    }

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

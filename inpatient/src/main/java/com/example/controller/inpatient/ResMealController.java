package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.services.inpatient.ResMealServer;
import com.pojos.hyj.AssayMeal;
import com.pojos.inpatient.DocAdv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/inpatient")
public class ResMealController {
    @Autowired
    ResMealServer resMealServer;
    //新增检验项目并新增消费记录
    @PostMapping("/addResMeal")
    public void addDocExe(@RequestBody Map<String,Object>map){
        String str= JSON.toJSONString(map.get("docAdv"));
        DocAdv docAdv =JSON.parseObject(str,DocAdv.class);
        String str2=JSON.toJSONString(map.get("checkHuaYan"));
        List<AssayMeal>list=JSON.parseArray(str2, AssayMeal.class);
        resMealServer.addResMeal(docAdv,list);
    }
}

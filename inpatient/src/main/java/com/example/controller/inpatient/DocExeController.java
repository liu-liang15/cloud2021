package com.example.controller.inpatient;


import com.alibaba.fastjson.JSON;
import com.example.model.services.inpatient.DocExeServer;
import com.pojos.inpatient.Dispensing;
import com.pojos.inpatient.DocExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inpatient")
public class DocExeController {
    @Autowired
    DocExeServer docExeServer;
    //护士站查看医嘱
    @GetMapping("/selDocExe")
    public List<DocExe> selDocExe(String param){
        return docExeServer.selDocExe(param);
    }
    //新增消费记录并修改执行状态
    @PostMapping("/upDateDocExe")
    public void upDateDocExe(@RequestBody Map<String,Object> map){
        String str= JSON.toJSONString(map.get("docExe"));
        List<DocExe>list=JSON.parseArray(str,DocExe.class);
        String str2=JSON.toJSONString(map.get("resNo"));
        String str3= JSON.toJSONString(map.get("dispensing"));
        Dispensing d = JSON.parseObject(str3,Dispensing.class);
        docExeServer.upDateDocExe(list,str2,d);
    }
    //临时医嘱
    @GetMapping("/selDocExe2")
    public List<DocExe> selDocExe2(String param){
        return docExeServer.selDocExe2(param);
    }
}

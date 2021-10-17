package com.example.controller.inpatient;


import com.alibaba.fastjson.JSON;
import com.example.model.services.inpatient.DocAdvServer;
import com.pojos.inpatient.DocAdv;
import com.pojos.inpatient.DocAdvXq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inpatient")
public class DocAdvController {
    @Autowired
    DocAdvServer docAdvServer;
    //新增医嘱和医嘱详单
    @PostMapping("/addDocAdv")
    public void addDocAdv(@RequestBody Map<String,Object> map){
        String str= JSON.toJSONString(map.get("docAdv"));
        DocAdv docAdv =JSON.parseObject(str,DocAdv.class);
        String str3= JSON.toJSONString(map.get("docAdvXq"));
        List<DocAdvXq> list2=JSON.parseArray(str3,DocAdvXq.class);
        System.out.println(list2);
        docAdvServer.addDocAdv(docAdv,list2);
    }
    //查看医嘱
    @GetMapping("/selDocAdv")
    public List<DocAdv> selDocAdv(String param){
        return docAdvServer.selDocAdv(param);
    }
    //停止医嘱
    @RequestMapping("stopAdv")
    public void stopAdv(String param){
        docAdvServer.stopAdv(param);
    }
}

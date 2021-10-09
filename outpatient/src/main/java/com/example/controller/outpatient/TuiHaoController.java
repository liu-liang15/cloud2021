package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.TuiHaoService;
import com.pojos.outpatient.Tuihao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/outpatient")
public class TuiHaoController {
    @Autowired
    TuiHaoService tuiHaoService;

    @RequestMapping("/insertTuiHao")
    public void insertTuiHao(String tuiHao){
        Tuihao tuihao = JSONObject.parseObject(tuiHao,Tuihao.class);
        System.out.println(tuihao);
        tuiHaoService.insertTuiHao(tuihao);
    }

    @GetMapping("/findAllTuiHao")
    public List<Tuihao> findAllTuiHao(String param){
         return tuiHaoService.findAllTuiHao(param);
    }
}

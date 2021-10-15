package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.TuiHaoService;
import com.pojos.outpatient.Tuihao;
import com.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
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
    public List<Tuihao> findAllTuiHao(String mzhao,String sj1,String sj2) throws ParseException {
        DataUtil da = new DataUtil();
        String st1 = da.UTCToCST(sj1, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");//国际时间转换北京时间
        String st2 = da.UTCToCST(sj2, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");//国际时间转换北京时间
         return tuiHaoService.findAllTuiHao(mzhao,st1,st2);
    }
}

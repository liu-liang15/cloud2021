package com.example.controller.outpatient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.CasehistoryDetailsService;
import com.pojos.outpatient.Casehistorydetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/outpatient")
public class CasehistoryDetailsController {
    @Autowired
    CasehistoryDetailsService casehistoryDetailsService;

    //修改诊断结果
    @RequestMapping("/editzhenduanjieguo")
    public void editzhenduanjieguo(String cahideZhenduanjieguo,String cahideNo){
        casehistoryDetailsService.editzhenduanjieguo(cahideZhenduanjieguo,cahideNo);
    }


    //-- 门诊号查询就诊记录，查询病历详情
    @GetMapping("/findCasehisDetailsBySeenumber")
    public Casehistorydetails findCasehisDetailsBySeenumber(String param){
        return casehistoryDetailsService.findCasehisDetailsBySeenumber(param);
    }

    //新增病详情
    @PostMapping("/insertBingLiXQ")
    public int insertBingLiXQ(@RequestBody Map<String,Object> map){
        String bingliXQ= JSON.toJSONString(map.get("bingliXQ"));
        String blNo= JSON.toJSONString(map.get("blNo"));
        Casehistorydetails casehistorydetails = JSONObject.parseObject(bingliXQ,Casehistorydetails.class);
        casehistorydetails.setCahideCashisNo(blNo);
        casehistoryDetailsService.insertBingLiXQ(casehistorydetails);
        return casehistorydetails.getCahideNo();
    }


    //查询所有病历详情
    @GetMapping("/findCasehisDetails")
    public List<Casehistorydetails> findCasehisDetails(String param){
        int i = Integer.parseInt(param);
        return casehistoryDetailsService.findCasehisDetails(i);
    }

}

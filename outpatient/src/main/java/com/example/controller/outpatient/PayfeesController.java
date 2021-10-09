package com.example.controller.outpatient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.PayfeesService;
import com.pojos.outpatient.Payfees;
import com.pojos.outpatient.PayfeesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class PayfeesController {
    @Autowired
    PayfeesService payfeesService;



    //修改状态，生成缴费单，详单
    @RequestMapping("updatePayZt")
    public int updatePayZt(@RequestBody Map<String,Object> map){
        String mzhao = JSON.toJSONString(map.get("Mzhao"));
        String zongJinE = JSON.toJSONString(map.get("ZongJinE"));
        zongJinE = zongJinE.substring(1,zongJinE.length()-1);
        double zongJinE1 = Double.parseDouble(zongJinE);
        String payDetailsform= JSON.toJSONString(map.get("PayDetailsform"));
        System.out.println(payDetailsform);
        payDetailsform = payDetailsform.substring(1,payDetailsform.length()-1);
        payDetailsform = payDetailsform.replace("},{","}!@{");
        String[] strArr= payDetailsform.split("!@");
        List<PayfeesDetails> payfeesDetailsList = new ArrayList<PayfeesDetails>();
        for (int i = 0; i < strArr.length; i++){
            PayfeesDetails payfeesDetails = JSONObject.parseObject(strArr[i],PayfeesDetails.class);
            payfeesDetailsList.add(payfeesDetails);
        }
        payfeesService.updatePayZt(zongJinE1,mzhao,payfeesDetailsList);
        return 1;
    }

    //查询就诊记录总价格进行缴费
    @GetMapping("/selJiuZhenZJG")
    public List<Payfees> selJiuZhenZJG(String param){
        System.out.println(param);
        return payfeesService.selJiuZhenZJG(param);
    }

    @GetMapping("/findpaycf")
    public List<PayfeesDetails> findpaycf(String param){
        return payfeesService.findpaycf(param);
    }
    @GetMapping("/findpayhy")
    public List<PayfeesDetails> findpayhy(String param){
        return payfeesService.findpayhy(param);
    }
    @GetMapping("/findpayjc")
    public List<PayfeesDetails> findpayjc(String param){
        return payfeesService.findpayjc(param);
    }
    @GetMapping("/findpayss")
    public List<PayfeesDetails> findpayss(String param){
        return payfeesService.findpayss(param);
    }
}

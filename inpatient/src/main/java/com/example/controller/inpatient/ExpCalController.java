package com.example.controller.inpatient;

import com.example.model.services.inpatient.ExpCalServer;
import com.pojos.hyj.AssayInfo;
import com.pojos.inpatient.ExpCal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class ExpCalController {
    @Autowired
    ExpCalServer expCalServer;
    //查看患者的消费记录
    @GetMapping("/selExpCal")
    public List<ExpCal> selExpCal(String param){
        return expCalServer.selExpCal(param);
    }
    //查看各种消费类型的消费总额
    @GetMapping("selMon")
    public List<ExpCal> selMon(String param) {
        return expCalServer.selMon(param);
    }
    //查看检查检验结果
    //查看结果
    @RequestMapping("selectInfoRes")
    public List<AssayInfo> selectInfoRes(String param){
        System.out.println(param);
        return expCalServer.selectInfoRes(param);
    }
}

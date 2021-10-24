package com.controller;

import com.model.serveices.BaoBiaoService;
import com.pojos.hyj.AssayPay;
import com.pojos.inpatient.ExpCal;
import com.pojos.outpatient.Feebill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hyj")
public class BaoBiaoController {
    @Resource
    BaoBiaoService baoBiaoService;
    @RequestMapping("findFeebMoney")
    public List<Feebill> findFeebMoney(String MTime){
        return baoBiaoService.findFeebMoney(MTime);
    }
    @RequestMapping("findZMoney")
    public List<ExpCal> findZMoney(String ZTime){
        return baoBiaoService.findZMoney(ZTime);
    }
    @RequestMapping("findPayMoney")
    public List<AssayPay> findPayMoney(String TTime){
        return baoBiaoService.findPayMoney(TTime);
    }
}

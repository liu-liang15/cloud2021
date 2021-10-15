package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.CaiGouService;
import com.pojos.pharmacy.CgDingDan;
import com.pojos.pharmacy.CgddXiangDan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pharmacy/")
public class CaiGouController {
    @Autowired
    CaiGouService caiGouService;

    //新增订单
    @RequestMapping("add-cgd")
    public String addJhd(@RequestBody CgDingDan cgDingDan){
        try {
            caiGouService.addCaiGou(cgDingDan);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
    //查询订单
    @RequestMapping("cgdd")
    public List<CgDingDan> findAllCGD(){
        return caiGouService.findAllCGD();
    }
    //根据订单id查询详单
    @RequestMapping("cgxd")
    public List<CgddXiangDan> findAllCGXD(String purchaseId){
        return caiGouService.findAllCGXD(purchaseId);
    }

    //查询所有待审核和待收货的订单
    @RequestMapping("cgd1")
    public List<CgDingDan> findByIdCGD1(){
        return caiGouService.findByIdCGD1();
    }
    //查询所有待入库的订单
    @RequestMapping("cgd2")
    public List<CgDingDan> findByIdCGD2(){
        return caiGouService.findByIdCGD2();
    }

    //根据订单id修改订单状态
    @RequestMapping("edit")
    public String editState(String stateId,String purchaseId){
        try {
            caiGouService.editState(stateId,purchaseId);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}

package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.GoYingShangService;
import com.pojos.pharmacy.GoYingShang;
import com.pojos.pharmacy.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pharmacy/")
public class GoYingShangController {
    @Autowired
    GoYingShangService goYingShangService;
    //查询供应商信息
    @RequestMapping("supplier")
    public List<GoYingShang> findAll(@RequestBody Hibernate hibernate){
        return goYingShangService.findAll(hibernate);
    }
    //新增修改供应商,根据供应商id区别是修改还是添加
    @RequestMapping("add-supplier")
    public String addSupplier(@RequestBody GoYingShang goYingShang){
        try {
            //查询数据库中是否存在改供应商名字
            int sum= goYingShangService.findId(goYingShang.getSupplyName());
            if(goYingShang.getSupplyId()==0) {
                if (sum == 0) {
                    goYingShangService.insert(goYingShang);
                    return "ok1";
                } else{
                    return "ok3";
                }
            }else{
                goYingShangService.update(goYingShang);
                return "ok2";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}

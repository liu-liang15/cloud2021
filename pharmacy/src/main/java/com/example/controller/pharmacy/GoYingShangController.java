package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.GoYingShangService;
import com.pojos.pharmacy.GoYingShang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("pharmacy/")
public class GoYingShangController {
    @Autowired
    GoYingShangService goYingShangService;

    @RequestMapping("supplier")
    public List<GoYingShang> findAll(){
        return goYingShangService.findAll();
    }

    @RequestMapping("add-supplier")
    public String addSupplier(@RequestBody GoYingShang goYingShang){
        try {
            if(goYingShang.getSupplyId()==0){
                goYingShangService.insert(goYingShang);
            }else{
                goYingShangService.update(goYingShang);
            }
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}

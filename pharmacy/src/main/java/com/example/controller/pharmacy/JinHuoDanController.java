package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.JinHuoDanService;
import com.pojos.pharmacy.CaiGoJh;
import com.pojos.pharmacy.JhXiangDan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pharmacy/")
public class JinHuoDanController {
    @Autowired
    JinHuoDanService jinHuoDanService;
    @RequestMapping("add-jhd")
    public String addDrug(@RequestBody CaiGoJh caiGoJh){
        try {
            jinHuoDanService.addJHD(caiGoJh);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("jhd")
    public List<CaiGoJh> findAllJHD(){
        return jinHuoDanService.findAllJHD();
    }
}

package com.example.controller.pharmacy;

import com.example.model.services.pharmacy.RukuService;
import com.pojos.pharmacy.RuKu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pharmacy/")
public class RukuController {
    @Autowired
    RukuService rukuService;
    //入库
    @RequestMapping("ruku")
    public String addJhd(@RequestBody RuKu ruKu){
        try {
            rukuService.addRKD(ruKu);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}

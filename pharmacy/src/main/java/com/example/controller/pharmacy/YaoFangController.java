package com.example.controller.pharmacy;


import com.example.model.services.pharmacy.YaoFangService;
import com.pojos.outpatient.Feebill;
import com.pojos.pharmacy.FaYao;
import com.pojos.pharmacy.YpYaoFang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class YaoFangController {
    @Autowired
    YaoFangService yaoFangService;
    @RequestMapping("allyp")
    public List<YpYaoFang> FindAll(){
       return yaoFangService.findAll();
    }
    @RequestMapping("fayao")
    public String addFaYao(@RequestBody FaYao faYao){
        try {
            yaoFangService.faYao(faYao);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}

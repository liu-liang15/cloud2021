package com.example.controller.pharmacy;


import com.example.model.services.pharmacy.HaoCaiService;
import com.pojos.pharmacy.HaoCai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("pharmacy/")
public class HaoCaiController {
    @Autowired
    HaoCaiService haoCaiService;
    //查看耗材类别
    @GetMapping("/selHCName")
    public List<HaoCai> selHCName(){
        return haoCaiService.selHCName();
    }
    //查看耗材规格
    @GetMapping("/selHCMatr")
    public List<HaoCai> selHCMatr(String param){
        return haoCaiService.selHCMatr(param);
    }
}

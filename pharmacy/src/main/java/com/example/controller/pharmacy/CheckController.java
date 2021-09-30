package com.example.controller.pharmacy;


import com.example.model.services.pharmacy.CheckService;
import com.pojos.pharmacy.PanDian;
import com.pojos.pharmacy.YaoKu;
import com.pojos.pharmacy.YpKuCun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("pharmacy/")
public class CheckController {
    @Autowired
    CheckService service;

    //查询订单
    @RequestMapping("warepd")
    public List<YpKuCun> FindByWareKC(int wareId) {
        return service.FindByWareKC(wareId);
    }
    @RequestMapping("ware")
    public List<YaoKu> FindAllWare(){
        return service.FindAllWare();
    }
    @RequestMapping("addpd")
    public void addPd(PanDian panDian){
        service.addPD(panDian);
    }
}

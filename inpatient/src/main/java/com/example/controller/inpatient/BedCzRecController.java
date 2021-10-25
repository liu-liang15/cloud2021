package com.example.controller.inpatient;


import com.example.model.services.inpatient.BedCzRecServer;
import com.pojos.inpatient.BedCzRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class BedCzRecController {
    @Autowired
    BedCzRecServer bedCzRecServer;
    //多条件查看床位操作记录
    @GetMapping("/selBedCzRec")
    public List<BedCzRec> selBedCzRec(String wardName,String bedCzTime1,String bedCzTime2,String czType){
        return bedCzRecServer.selBedCzRec(wardName,bedCzTime1,bedCzTime2,czType);
    }
}

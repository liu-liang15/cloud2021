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
    @GetMapping("/selBedCzRec")
    public List<BedCzRec> selBedCzRec(String param){
        return bedCzRecServer.selBedCzRec(param);
    }
}

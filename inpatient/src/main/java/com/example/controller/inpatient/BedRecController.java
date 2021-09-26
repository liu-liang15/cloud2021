package com.example.controller.inpatient;


import com.example.model.services.inpatient.BedRecServer;
import com.pojos.inpatient.BedRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/inpatient")
public class BedRecController {
    @Autowired
    BedRecServer bedRecServer;
    @GetMapping("/selBedRec")
    public List<BedRec> selBedRec(){
        return bedRecServer.selBedRec();
    }
}

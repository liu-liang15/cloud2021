package com.example.controller.outpatient;

import com.example.model.services.outpatient.HospregcateService;
import com.pojos.outpatient.Hospregcate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class HospregcateController {
    @Autowired
    HospregcateService hospregcateService;

    //查询所有挂号记录
    @GetMapping("/findAllHopregcate")
    public List<Hospregcate> findAllHopregcate(){
        return hospregcateService.findAllHopregcate();
    }

}

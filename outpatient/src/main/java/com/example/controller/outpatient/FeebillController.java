package com.example.controller.outpatient;

import com.example.model.services.outpatient.CasehistoryDetailsService;
import com.example.model.services.outpatient.CasehistoryService;
import com.example.model.services.outpatient.FeebillService;
import com.pojos.outpatient.Casehistory;
import com.pojos.outpatient.Feebill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/outpatient")
public class FeebillController {

    @Autowired
    FeebillService feebillService;

    @RequestMapping("/findAllDFYP")
    public List<Feebill> findAllDFYP(){
        return feebillService.findAllDFYP();
    }
}

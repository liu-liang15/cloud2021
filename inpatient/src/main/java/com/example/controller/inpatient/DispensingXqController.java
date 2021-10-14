package com.example.controller.inpatient;

import com.example.model.services.inpatient.DispensingServer;
import com.example.model.services.inpatient.DispensingXqServer;
import com.pojos.inpatient.DispensingXq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class DispensingXqController {
    @Autowired
    DispensingXqServer dispensingXqServer;
    @GetMapping("selDisXq")
    public List<DispensingXq> selDisXq(String param){
        return dispensingXqServer.selDisXq(param);
    }
}

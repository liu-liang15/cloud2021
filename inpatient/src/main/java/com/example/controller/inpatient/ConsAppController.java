package com.example.controller.inpatient;


import com.example.model.services.inpatient.ConsAppServer;
import com.pojos.inpatient.ConsApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/inpatient")
public class ConsAppController {
    @Autowired
    ConsAppServer consAppServer;
    //新增手术申请单
    @PostMapping("/addConsApp")
    public void addConsApp(@RequestBody ConsApp consApp){
        consAppServer.addConsApp(consApp);
    }
    //查看手术申请单
    @GetMapping("/selConsApp")
    public List<ConsApp> selConsApp(){
        return consAppServer.selConsApp();
    }
}

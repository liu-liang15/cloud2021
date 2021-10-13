package com.example.controller.inpatient;

import com.example.model.services.inpatient.DispensingServer;
import com.pojos.inpatient.Dispensing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class DispensingController {
    @Autowired
    DispensingServer dispensingServer;
    //查询发药单
    @GetMapping("selDis")
    public List<Dispensing> selDis(String param){
        return dispensingServer.selDis(param);
    }
    //修改发药单
    @PostMapping("changeDis")
    public void changeDis(Dispensing dispensing){
        dispensingServer.changeDis(dispensing);
    }
}

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
    //根据住院号查询某患者发药单
    @GetMapping("selDis")
    public List<Dispensing> selDis(String param){
        return dispensingServer.selDis(param);
    }
    //查询长期医嘱的待发药单
    @RequestMapping("selDis2")
    public List<Dispensing> selDis2(){
        return dispensingServer.selDis2();
    }
    //查询短期医嘱的待发药单
    @RequestMapping("selDis3")
    public List<Dispensing> selDis3(){
        return dispensingServer.selDis3();
    }
    //修改发药单
    @PostMapping("changeDis")
    public void changeDis(Dispensing dispensing){
        dispensingServer.changeDis(dispensing);
    }
}

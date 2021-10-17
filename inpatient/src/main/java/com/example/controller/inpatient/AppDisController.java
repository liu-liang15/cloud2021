package com.example.controller.inpatient;

import com.example.model.services.inpatient.AppDisServer;
import com.pojos.inpatient.AppDis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class AppDisController {
    @Autowired
    AppDisServer appDisServer;
    //新增出院申请
    @PostMapping("addDisApp")
    public void addDisApp(@RequestBody AppDis disApp){
        appDisServer.addDisApp(disApp);
    }
    //查看出院申请
    @GetMapping("selDisApp")
    public List<AppDis> selDisApp(String param){
       return appDisServer.selAppDis(param);
    }
    //确认出院
    @PostMapping("changeAppDis")
    public void changeAppDis(@RequestBody AppDis disApp){
        appDisServer.changeAppDis(disApp);
    }
}

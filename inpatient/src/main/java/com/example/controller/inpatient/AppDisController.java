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
    //多条件查询出院申请单
    @GetMapping("selAppByAll")
    public List<AppDis> selAppByAll(String name,String idcart,String appDisNo,
                                    String outDate1,String outDate2,String appZt){
        return appDisServer.selAppByAll(name,idcart,appDisNo,outDate1,outDate2,appZt);
    }
    //确认出院
    @PostMapping("changeAppDis")
    public void changeAppDis(@RequestBody AppDis disApp){
        appDisServer.changeAppDis(disApp);
    }
    //根据住院单号查看出院单
    @GetMapping("selAppDisByResNo")
    public String selAppDisByResNo(String resNo){
        return appDisServer.selAppDisByResNo(resNo);
    }
}

package com.example.controller.inpatient;

import com.example.model.services.inpatient.HosAloneServer;
import com.pojos.inpatient.HosAlone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class HosAloneController {
    @Autowired
    HosAloneServer hosAloneServer;
    @GetMapping("/hos")
    public List<HosAlone> allHos(String param){
        return hosAloneServer.allHos(param);
    }
    @RequestMapping("/add-hos")
    public void addHos(@RequestBody HosAlone hosalone){
        //HosAlone hosAlone = JSONObject.parseObject(hosalone, HosAlone.class);
        hosAloneServer.addHos(hosalone);
    }
    //根据住院单号查看患者
    @GetMapping("/selHos2")
    public List<HosAlone> selHos2(String param){
        return hosAloneServer.selHos2(param);
    }
}

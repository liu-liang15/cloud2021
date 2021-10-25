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
    //查询住院单
    @GetMapping("/hos")
    public List<HosAlone> allHos(String param){
        return hosAloneServer.allHos(param);
    }
    //多条件查询住院单
    @GetMapping("/selHosByAll")
    public List<HosAlone> selHosByAll(String name, String idcart,
                                      String resNo,String hosStay1,
                                      String hosStay2,String ksId){
        return  hosAloneServer.selHosByAll(name,idcart,resNo,hosStay1,hosStay2,ksId);
    }
    //新增住院单
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
    //查看所有住院通知单
    @GetMapping("/selHosByZt")
    public List<HosAlone> selHosByZt(String name,String resNo,String mediCard){
        return hosAloneServer.selHosByZt(name,resNo,mediCard);
    }
}

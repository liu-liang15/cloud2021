package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.services.inpatient.WardServer;
import com.pojos.inpatient.Ward;
import com.pojos.inpatient.WardRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inpatient")
public class WardController {
    @Autowired
    WardServer wardServer;
    //新增病房
    @PostMapping("/addWard")
    public String addWard(@RequestBody Ward ward){
        return wardServer.addWard(ward);
    }
    //查看病房
    @GetMapping("/ward")
    public List<Ward> selWard(String param){
        return wardServer.selWard(param);
    }
    //多条件查看病房
    @GetMapping("/selWardByAll")
    public List<Ward> selWardByAll(String name,String ksId,String wardZt){
        return  wardServer.selWardByAll(name,ksId,wardZt);
    }
    //启用/停用病房
    @PostMapping("/updateWard")
    public void updateWard(@RequestBody Map<String, Object> map){
        String str = JSON.toJSONString(map.get("ward"));
        Ward ward=JSON.parseObject(str,Ward.class);
        String str2 = JSON.toJSONString(map.get("wardRec"));
        WardRec wardRec=JSON.parseObject(str2,WardRec.class);
        if(ward.getWardZt().equals("0")){
            ward.setWardZt("1");
            wardRec.setRecType("停用");
        }else if (ward.getWardZt().equals("1")){
            ward.setWardZt("0");
            wardRec.setRecType("启用");
        }
        wardServer.updateWard(ward,wardRec);
    }
    //修改病房
    @PostMapping("/changeWard")
    public String changeWard(@RequestBody Ward ward ){
        return wardServer.changeWard(ward);
    }
}

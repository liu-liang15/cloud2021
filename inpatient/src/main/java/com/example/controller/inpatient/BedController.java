package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.services.inpatient.BedServer;
import com.pojos.inpatient.Bed;
import com.pojos.inpatient.BedCzRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/inpatient")
public class BedController {
    @Autowired
    BedServer bedServer;
    //查看床位
    @GetMapping("/selBed")
    public List<Bed> selBed(String param, String zt){
        System.out.println("这是"+param+"这是"+zt);
        return bedServer.selBed(param,zt);
    }
    //新增床位
    @PostMapping("/addBed")
    public void addBed(@RequestBody Map<String, Object> map){
        System.out.println(map);
        String str= JSON.toJSONString(map.get("bed"));
        Bed bed= JSON.parseObject(str,Bed.class);
        String number= JSON.toJSONString(map.get("bedNumber"));
        bedServer.addBed(bed,Integer.parseInt(number.split("\"")[1]));
    }
    //查看患者与床位
    @GetMapping("/allocBed")
    public List<Bed> allocBed(String param){
        return bedServer.allocBed(param);
    }
    @PostMapping("/updateBed")
    public void updateBed(@RequestBody Map<String, Object> map){
        System.out.println("进方法"+map.get("bedRec"));
        String str= JSON.toJSONString(map.get("bed"));
        Bed bed= JSON.parseObject(str,Bed.class);
        String str2= JSON.toJSONString(map.get("bedRec"));
        BedCzRec bedCzRec= JSON.parseObject(str2,BedCzRec.class);

        if(bed.getBedZt().equals("0")){
            bed.setBedZt("1");
            bedCzRec.setBedCzType("停用");
        }else if(bed.getBedZt().equals("1")){
            bed.setBedZt("0");
            bedCzRec.setBedCzType("启用");
        }
        bedServer.updateBed(bed,bedCzRec);
    }
    @PostMapping("/updateBed2")
    public void updateBed2(@RequestBody Bed bed){
        bedServer.updateBed2(bed);
    }
    //查看住院单详情
    @GetMapping("/hosXq")
    public List<Bed> hosXq(String param){
        return bedServer.hosXq(param);
    }
}

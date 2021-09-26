package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.services.inpatient.OpeRoomServer;
import com.pojos.inpatient.OpeCzRec;
import com.pojos.inpatient.OpeRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/inpatient")
public class OpeRoomController {
    @Autowired
    OpeRoomServer opeRoomServer;
    //查看手术室
    @GetMapping("/selRoom")
    public List<OpeRoom> selRoom(String param){
        return opeRoomServer.selRoom(param);
    }
    //新增手术表
    @PostMapping("/addRoom")
    public void addRoom(@RequestBody OpeRoom opeRoom){
        opeRoomServer.addRoom(opeRoom);
    }
    //修改手术室表
    @PostMapping("/updateRoom")
    public void upDateRoom(@RequestBody OpeRoom opeRoom){
        opeRoomServer.upDateRoom(opeRoom);
    }
    // 启用/停用手术室
    @PostMapping("/stRoom")
    public void stRoom(@RequestBody Map<String,Object>map){
        System.out.println("进方法了");
        String str= JSON.toJSONString(map.get("opeRoom"));
        OpeRoom opeRoom=JSON.parseObject(str,OpeRoom.class);
        String str2= JSON.toJSONString(map.get("opeCz"));
        OpeCzRec opeCzRec=JSON.parseObject(str2,OpeCzRec.class);
        if(opeRoom.getOpeZt().equals("0")){
            opeRoom.setOpeZt("1");
            opeCzRec.setOpeCzType("停用");
        }else if(opeRoom.getOpeZt().equals("1")){
            opeRoom.setOpeZt("0");
            opeCzRec.setOpeCzType("启用");
        }
        opeRoomServer.stRoom(opeRoom,opeCzRec);
    }
}

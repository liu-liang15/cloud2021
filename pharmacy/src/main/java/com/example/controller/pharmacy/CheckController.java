package com.example.controller.pharmacy;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.example.model.services.pharmacy.CheckService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojos.pharmacy.PanDian;
import com.pojos.pharmacy.XiaoHuiSq;
import com.pojos.pharmacy.YaoKu;
import com.pojos.pharmacy.YpKuCun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("pharmacy/")
public class CheckController {
    @Autowired
    CheckService service;

    //查询订单
    @RequestMapping("warepd")
    public List<YpKuCun> FindByWareKC(int wareId) {
        return service.FindByWareKC(wareId);
    }
    @RequestMapping("ware")
    public List<YaoKu> FindAllWare(){
        return service.FindAllWare();
    }
    @RequestMapping("addpd")
    public String addPd(@RequestBody Map<String,Object> map) {
        XiaoHuiSq xiaoHuiSq=JSONObject.parseObject(JSONObject.toJSONString(map.get("xiaoHuiSq")),XiaoHuiSq.class);
        PanDian panDian=JSONObject.parseObject(JSONObject.toJSONString(map.get("panDian")),PanDian.class);
        try {
            service.addPD(panDian,xiaoHuiSq);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}

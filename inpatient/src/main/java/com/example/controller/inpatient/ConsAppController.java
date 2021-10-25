package com.example.controller.inpatient;


import com.alibaba.fastjson.JSON;
import com.example.model.dao.inpatient.ExpCalDao;
import com.example.model.services.inpatient.ConsAppServer;
import com.example.model.services.inpatient.ExpCalServer;
import com.pojos.hyj.AssayInfo;
import com.pojos.inpatient.ConsApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inpatient")
public class ConsAppController {
    @Autowired
    ConsAppServer consAppServer;
    @Autowired
    //新增手术申请单
    @PostMapping("/addConsApp")
    public void addConsApp(@RequestBody Map<String,Object> map) throws ParseException {
        Date conStar=null;
        if(map.get("conStar")!=null){
            conStar = UTCToCST(map.get("conStar") + "", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            String s=JSON.toJSONString(map.get("consApp"));
            ConsApp consApp=JSON.parseObject(s,ConsApp.class);
            consApp.setConStar(new Timestamp(conStar.getTime()));
            consAppServer.addConsApp(consApp);
        }
        //sdf.parse(map.get("conStar")+"");
        //consAppServer.addConsApp(consApp);
    }
    //查看手术申请单
    @GetMapping("/selConsApp")
    public List<ConsApp> selConsApp(String surName,String name,String conZt){
        return consAppServer.selConsApp(surName,name,conZt);
    }
    //修改手术申请单
    @PostMapping("changeCons")
    public void changeCons(@RequestBody ConsApp consApp){
        consAppServer.changeCons(consApp);
    }
    //根据手术编号查看手术
    @GetMapping("selConsBySurNo")
    public String selConsBySurNo(String surNo){
        return consAppServer.selConsBySurNo(surNo);
    }
    //根据住院单号查看手术
    @GetMapping("selConsAppByResNo")
    public List<ConsApp>selConsAppByResNo(String resNo){
        return consAppServer.selConsAppByResNo(resNo);
    }

    /**
     * 国际时间转换北京时间
     * @param UTCStr
     * @param format
     * @return
     * @throws ParseException
     */
    public Date UTCToCST(String UTCStr, String format) throws ParseException {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        date = sdf.parse(UTCStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) + 8);
        //calendar.getTime() 返回的是Date类型，也可以使用calendar.getTimeInMillis()获取时间戳
        return calendar.getTime();
    }



}

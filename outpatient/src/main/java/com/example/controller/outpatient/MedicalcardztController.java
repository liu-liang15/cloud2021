package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.MedicalcardztService;
import com.pojos.outpatient.Medicalcardzt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/outpatient")
public class MedicalcardztController {
    @Autowired
    MedicalcardztService medicalcardztService;

    @RequestMapping("/addMedicalcardzt")
    public void addMedicalcardCzjl(String Medicalcardzt){
        com.pojos.outpatient.Medicalcardzt medicalcardzt = JSONObject.parseObject(Medicalcardzt,Medicalcardzt.class);
        System.out.println(medicalcardzt);
        medicalcardztService.save(medicalcardzt);
    }

    @GetMapping("/findAllMedicalcardzt")
    public List<Medicalcardzt> findAllMedicalcardzt(String param){
         return medicalcardztService.findAllMedicalcardzt(param);
    }

    //年月日时分秒
    public String getDateNo(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    //根据出生日期计算年龄
    public String getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) { //出生日期晚于当前时间，无法计算
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);  //当前年份
        int monthNow = cal.get(Calendar.MONTH);  //当前月份
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); //当前日期
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;   //计算整岁数
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;//当前日期在生日之前，年龄减一
            }else{
                age--;//当前月份在生日之前，年龄减一
            }
        }
        return age+"";
    }
}

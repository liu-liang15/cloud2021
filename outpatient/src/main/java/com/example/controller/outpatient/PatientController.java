package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.PatientService;
import com.pojos.outpatient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class PatientController {
    @Autowired
    PatientService patientService;

    //查询病人信
    @GetMapping("/findAllPatient")
    public List<Patient> findAll(String param){
        return patientService.findAll(param);
    }

    //新增修改
    @RequestMapping("/savePatient")
    public void insertPatient(String patient) throws Exception {
        System.out.println(patient);
        Patient patient1 = JSONObject.parseObject(patient,Patient.class);
        String age = getAge(patient1.getPatientBirthdate());
        patient1.setPatientAge(age);
        patient1.setPatientDate(new Date());
        System.out.println(patient1);
        patientService.savePatient(patient1);
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

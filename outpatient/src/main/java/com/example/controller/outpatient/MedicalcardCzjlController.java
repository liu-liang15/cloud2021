package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.services.outpatient.MedicalcardCzjlService;
import com.example.model.services.outpatient.MedicalcardService;
import com.pojos.inpatient.Medicalcardjfjl;
import com.pojos.outpatient.Medicalcardczjl;
import com.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/outpatient")
public class MedicalcardCzjlController {
    @Autowired
    MedicalcardCzjlService medicalcardCzjlService;
    @Autowired
    MedicalcardService medicalcardService;


    @GetMapping("/findAllMedicalcardCzjl")
    public List<Medicalcardczjl> findAllMedicalcardCzjl(String zlkhao,String name,String idcard,String phone,String zffs,String sj1,String sj2) throws ParseException {
        DataUtil da = new DataUtil();
        String st1 = da.UTCToCST(sj1, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");//国际时间转换北京时间
        String st2 = da.UTCToCST(sj2, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");//国际时间转换北京时间
        return medicalcardCzjlService.findAllMedicalcardCzjl(zlkhao,name,idcard,phone,zffs,st1,st2);
    }

    //新增诊疗卡
    @RequestMapping("/addMedicalcardCzjl")
    public void addMedicalcardCzjl(String Medicalcardczjl){
        System.out.println(Medicalcardczjl);

//        medicalcardService.findMedicalcardByMediCard(mediCard);
        Medicalcardczjl Medicalcardczjl1 = JSONObject.parseObject(Medicalcardczjl,Medicalcardczjl.class);
        medicalcardCzjlService.addMedicalcardCzjl(Medicalcardczjl1);
    }
    //修改卡余额
    @RequestMapping("/updatepat")
    public void updatePat(@RequestBody Medicalcardjfjl med){
        System.err.println(med.getMecajfjlMoney()+"guolai修改卡余额"+Integer.parseInt(med.getMecajfjlMediNo()));
        medicalcardCzjlService.updatePat(med.getMecajfjlMoney(),Integer.parseInt(med.getMecajfjlMediNo()));
    }
    //修改卡余额2
    @RequestMapping("/updatepat1")
    public void updatePat2(double mecajfjlMoney,String mecajfjlNo){
        medicalcardCzjlService.updatePat(mecajfjlMoney,Integer.parseInt(mecajfjlNo));
    }

}

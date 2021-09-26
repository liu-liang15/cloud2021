package com.example.controller.outpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.services.outpatient.*;
import com.pojos.outpatient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class YiShengJiuZhenController {
    @Autowired
    PrescriptionService prescriptionService;
    @Autowired
    AssayService assayService;
    @Autowired
    MzshoushucfService mzshoushucfService;
    @Autowired
    AssayMealBlipService assayMealBlipService;
    @Autowired
    ExamineorderService examineorderService;


    //新增检查处方详情(化验)
    @PostMapping("/insertExaminedetails")
    public void insertExaminedetails(@RequestBody Map<String,Object> map){
        String exaordNo1= JSON.toJSONString(map.get("exaordNo"));
        String str= JSON.toJSONString(map.get("examinedetails"));
        List<Examinedetails>list2=JSON.parseArray(str, Examinedetails.class);
        System.out.println(list2);
        System.out.println(exaordNo1);
        examineorderService.insertExaminedetails(list2,exaordNo1);
    }
    //新增处方检查单
    @RequestMapping("/insertExamineorder")
    public int insertExamineorder(String exaordSeedoNumber,String exaordMoney1){
        double exaordMoney = Double.parseDouble(exaordMoney1);
        Examineorder examineorder = new Examineorder(0,exaordSeedoNumber,exaordMoney,null,0);
        examineorderService.insertExamineorder(examineorder);
        return examineorder.getExaordNo();
    }


    //查询检查项目findBlip
    @PostMapping("/findBlip")
    public List<AssayMealBlip> findBlip(){
        return assayMealBlipService.findBlip();
    }

    //新增手术处方详情
    @PostMapping("/insertMzshoushuxq")
    public void insertMzshoushuxq(@RequestBody Map<String,Object> map){
        String sqSsNo1= JSON.toJSONString(map.get("sqSsNo"));
        String str= JSON.toJSONString(map.get("mzshoushuxq"));
        List<Mzshoushuxq>list2=JSON.parseArray(str, Mzshoushuxq.class);
        System.out.println(list2);
        System.out.println(sqSsNo1);
        mzshoushucfService.insertMzshoushuxq(list2,sqSsNo1);
    }
    //新增处方手术单
    @RequestMapping("/insertMzshoushucf")
    public int insertMzshoushucf(String ssSeedoNumber,String shoushujiage1){
        double shoushujiage = Double.parseDouble(shoushujiage1);
        Mzshoushucf mzshoushucf = new Mzshoushucf(0,ssSeedoNumber,shoushujiage,null,0);
        mzshoushucfService.insertMzshoushucf(mzshoushucf);
        return mzshoushucf.getSsNo();
    }


    //新增化验处方详情(化验)
    @PostMapping("/insertLabworkdetailsCF")
    public void insertLabworkdetailsCF(@RequestBody Map<String,Object> map){
        String assayNo= JSON.toJSONString(map.get("assayNo"));
        String str= JSON.toJSONString(map.get("labworkDetails"));
        List<Labworkdetails>list2=JSON.parseArray(str, Labworkdetails.class);
        System.out.println(list2);
        assayService.insertLabworkdetailsCF(list2,assayNo);
    }
    //新增处方化验单
    @RequestMapping("/insertAssayChufang")
    public int insertAssayChufang(String assaySeedoNumber,String assayMoney1){
        double assayMoney = Double.parseDouble(assayMoney1);
        Assay assay = new Assay(0,assaySeedoNumber,assayMoney,null,0);
        assayService.insertAssayCF(assay);
        System.out.println(assay.getAssayNo());
        return assay.getAssayNo();
    }


    //新增处方详情(药品)
    @PostMapping("/insertChufangXQ")
    public void insertChufangXQ(@RequestBody Map<String,Object> map){
        String predetPresNo= JSON.toJSONString(map.get("predetPresNo"));
        String str= JSON.toJSONString(map.get("prede"));
        List<Prescriptiondetails>list2=JSON.parseArray(str, Prescriptiondetails.class);
        System.out.println(list2);
        prescriptionService.insertChufangXQ(list2,predetPresNo);
    }
    //新增处方
    @RequestMapping("/insertChufang")
    public int insertChufang(String presSeedoNumber,String presMoney,String presFamiroomNo,String presDocNo,String seeNo){
        double money = Double.parseDouble(presMoney);
        int seedNo = Integer.parseInt(seeNo);
        Prescription p = new Prescription(0,seedNo,presSeedoNumber,presFamiroomNo,presDocNo,money,null,null);
        prescriptionService.insertChufang(p);
        return p.getPresNo();
    }
}

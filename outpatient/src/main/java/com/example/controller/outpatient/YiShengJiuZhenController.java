package com.example.controller.outpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.services.outpatient.*;
import com.pojos.outpatient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/outpatient")
public class YiShengJiuZhenController {
    @Autowired
    AssayMealBlipService assayMealBlipService;
    @Autowired
    PrescriptionService prescriptionService;
    @Autowired
    AssayService assayService;
    @Autowired
    MzshoushucfService mzshoushucfService;
    @Autowired
    ExamineorderService examineorderService;

//    修改处方检验订单的总价格
    @RequestMapping("/updatecfjyddzjg")
    public void updatecfjyddzjg(String jiage,String mzhao){
        double jg = Double.parseDouble(jiage);
        assayService.updatecfjyddzjg(jg,mzhao);
    }
    //    修改处方检查订单的总价格
    @RequestMapping("/updatecfjcddzjg")
    public void updatecfjcddzjg(String jiage,String mzhao){
        double jg = Double.parseDouble(jiage);
        examineorderService.updatecfjcddzjg(jg,mzhao);
    }
    //    修改处方手术订单的总价格
    @RequestMapping("/updatecfssddzjg")
    public void updatecfssddzjg(String jiage,String mzhao){
        double jg = Double.parseDouble(jiage);
        mzshoushucfService.updatecfssddzjg(jg,mzhao);
    }
    //    修改处方药品订单的总价格
    @RequestMapping("/updatecfypddzjg")
    public void updatecfypddzjg(String jiage,String mzhao){
        double jg = Double.parseDouble(jiage);
        prescriptionService.updatecfypddzjg(jg,mzhao);
    }

    //查询药品详单的状态为1的记录
    @RequestMapping("/selectypxqzt1")
    public List<Prescriptiondetails> selectypxqzt1(String param){
        return prescriptionService.selectypxqzt1(param);
    }
    //    查询药品订单，根据门诊号
    @RequestMapping("/selectypdd")
    public Prescription selectypdd(String param){
        return prescriptionService.selectypdd(param);
    }

    //查询检查详单的状态为1的记录
    @RequestMapping("/selectjcxqzt1")
    public List<Examinedetails> selectjcxqzt1(String param){
        return examineorderService.selectjcxqzt1(param);
    }
    //    查询检查订单，根据门诊号
    @RequestMapping("/selectjcdd")
    public Examineorder selectjcdd(String param){
        return examineorderService.selectjcdd(param);
    }

    //查询检验详单的状态为1的记录
    @RequestMapping("/selectjyxqzt1")
    public List<Labworkdetails> selectjyxqzt1(String param){
        return assayService.selectjyxqzt1(param);
    }
    //    查询检验订单，根据门诊号
    @RequestMapping("/selectjydd")
    public Assay selectjydd(String param){
        return assayService.selectjydd(param);
    }

    //查询手术详单的状态为1的记录
    @RequestMapping("/selectssxqzt1")
    public List<Mzshoushuxq> selectssxqzt1(String param){
        return mzshoushucfService.selectssxqzt1(param);
    }
    //    查询手术订单，根据门诊号
    @RequestMapping("/selectssdd")
    public Mzshoushucf selectssdd(String param){
        return mzshoushucfService.selectssdd(param);
    }

    //删除所有详单状态为一的数据
    @RequestMapping("/delcfddzt1")
    public void delcfddzt1(String param){
        System.out.println("-----------------");
        System.out.println(param);
        //根据门诊删除处方手术详单状态为1的数据
        mzshoushucfService.delsscfddzt1(param);
        //根据门诊删除处方检验详单状态为1的数据
        assayService.deljycfddzt1(param);
        //根据门诊删除处方检查详单状态为1的数据
        examineorderService.deljccfddzt1(param);
        //根据门诊删除处方药品详单状态为1的数据
        prescriptionService.delypypddzt1(param);

    }

    //新增处方检查单
    @RequestMapping("/insertExamineorder")
    public int insertExamineorder(String exaordSeedoNumber,String exaordMoney1){
        double exaordMoney = Double.parseDouble(exaordMoney1);
        Examineorder examineorder = new Examineorder(0,exaordSeedoNumber,exaordMoney,null,0);
        examineorderService.insertExamineorder(examineorder);
        return examineorder.getExaordNo();
    }
    //新增检查处方详情(化验)
    @PostMapping("/insertExaminedetails")
    public void insertExaminedetails(@RequestBody Map<String,Object> map){
        String exaordNo1= JSON.toJSONString(map.get("exaordNo"));
        String str= JSON.toJSONString(map.get("examinedetails"));
        List<Labworkdetails>list2=JSON.parseArray(str, Labworkdetails.class);
        examineorderService.insertExaminedetails(list2,exaordNo1);
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
        assayService.insertLabworkdetailsCF(list2,assayNo);
    }
    //新增处方化验单
    @RequestMapping("/insertAssayChufang")
    public int insertAssayChufang(String assaySeedoNumber,String assayMoney1){
        double assayMoney = Double.parseDouble(assayMoney1);
        Assay assay = new Assay(0,assaySeedoNumber,assayMoney,null,0);
        assayService.insertAssayCF(assay);
        return assay.getAssayNo();
    }


    //新增处方详情(药品)
    @PostMapping("/insertChufangXQ")
    public void insertChufangXQ(@RequestBody Map<String,Object> map){
        String predetPresNo= JSON.toJSONString(map.get("predetPresNo"));
        String str= JSON.toJSONString(map.get("prede"));
        List<Prescriptiondetails>list2=JSON.parseArray(str, Prescriptiondetails.class);
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

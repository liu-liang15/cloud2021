package com.controller;

import com.model.serveices.AssayInfoService;
import com.model.serveices.AssayResService;
import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hyj/")
public class AssayInfoController {
    @Resource
    AssayInfoService assayInfoService;
    @Resource
    AssayResService assayResService;
    @RequestMapping("addAssayInfo")
    public int addAssayInfo(@RequestBody AssayInfo assayInfo){
        return assayInfoService.addAssayInfo(assayInfo);
    }
    @RequestMapping("editPersonK")
    public void editPersonK(@RequestBody AssayInfo assayInfo){
        assayInfoService.editPersonK(assayInfo);
    }
    @RequestMapping("selectInfo")
    public List<AssayInfo> selectInfo(){
        return assayInfoService.selectInfo();
    }
    @RequestMapping("addPay")
    public void addPay(@RequestBody AssayPay assayPay){
        assayInfoService.addPay(assayPay);
    }
    @RequestMapping("editKeyboarder")
    public void editKeyboarder(@RequestBody AssayInfo assayInfo){
        assayResService.editKeyboarder(assayInfo);
    }
    @RequestMapping("findKsByMeal")
    public List<AssayMeal> findKsByMeal(@RequestBody AssayMeal assayMeal){
        return assayResService.findKsByMeal(assayMeal);
    }
    @RequestMapping("selectInfoRes")
    public List<AssayInfo> selectInfoRes(){
        return assayResService.selectInfo();
    }
    @RequestMapping("findInfoRes")
    public List<AssayInfo> findInfoRes(@RequestBody AssayInfo assayInfo){
        return assayResService.findInfoRes(assayInfo);
    }
    @RequestMapping("findInfoImg")
    public List<AssayInfo> findInfoImg(@RequestBody AssayInfo assayInfo){
        return assayResService.findInfoImg(assayInfo);
    }
    @RequestMapping("addMealInfo")
    public void addMealInfo(@RequestBody AssayInfo assayInfo){
        assayInfoService.addMealInfo(assayInfo);
    }
    @RequestMapping("findMealInfo")
    public List<AssayInfo> findMealInfo(){
        return assayInfoService.findMealInfo();
    }
    @RequestMapping("findAssayInfoById")
    public List<AssayInfo> findAssayInfoById(@RequestBody AssayInfo assayInfo){
        return assayInfoService.findAssayInfoById(assayInfo);
    }
    @RequestMapping("findInfoLikeBy")
    public List<AssayInfo> findInfoLikeBy(String tc){
        return assayInfoService.findInfoLikeBy(tc);
    }
    @RequestMapping("findInfoLikeBy2")
    public List<AssayInfo> findInfoLikeBy2(String xm1){
        return assayInfoService.findInfoLikeBy2(xm1);
    }
    @RequestMapping("findInfoLikeBy3")
    public List<AssayInfo> findInfoLikeBy3(String xm2){
        return assayInfoService.findInfoLikeBy3(xm2);
    }
}

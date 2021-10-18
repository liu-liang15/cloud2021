package com.controller;

import com.model.serveices.MealInfoService;
import com.pojos.hyj.AssayMealImg;
import com.pojos.hyj.AssayRes;
import com.pojos.hyj.MealInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("hyj/")
public class MealInfoController {
    @Resource
    MealInfoService mealInfoService;
    @RequestMapping("addMealInfor")
    public void addMealInfor(@RequestBody MealInfo mealInfo){
        mealInfoService.addMealInfor(mealInfo);
    }
    @RequestMapping("addMealRes")
    public void addMealRes(@RequestBody AssayRes assayRes){
        mealInfoService.addMealRes(assayRes);
    }
    @RequestMapping("findMealOk")
    public List<MealInfo> findMealOk(@RequestBody MealInfo mealInfo){
        return mealInfoService.findMealOk(mealInfo);
    }
    @RequestMapping("findResInfo")
    public List<AssayRes> findResInfo(@RequestBody AssayRes assayRes){
        return mealInfoService.findResInfo(assayRes);
    }
    @RequestMapping("addInfoImg")
    public void addInfoImg(@RequestBody List<AssayMealImg> assayMealImgs){
        mealInfoService.addInfoImg(assayMealImgs);
    }
    @RequestMapping("findImgInfo")
    public List<MealInfo> findImgInfo(@RequestBody MealInfo mealInfo){
        return mealInfoService.findImgInfo(mealInfo);
    }
}

package com.controller;

import com.model.serveices.MealImgService;
import com.pojos.hyj.AssayMealImg;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("hyj/")
public class MealImgController {
    @Resource
    MealImgService mealImgService;
    @RequestMapping("addImg")
    public void addImg(@RequestBody AssayMealImg assayMealImg){
        mealImgService.addImg(assayMealImg);
    }
}

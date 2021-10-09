package com.controller;

import com.model.serveices.AssayBlipService;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayMealBlip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hyj/")
public class AssayBlipController {
    @Autowired
    AssayBlipService assayBlipService;
    @RequestMapping("addMealBlip")
    public void addBlip(@RequestBody AssayMealBlip assayMealBlip){
        assayBlipService.addMealBlip(assayMealBlip);
    }
    @RequestMapping("findMealBlip")
    public List<AssayMealBlip> findMealBlip(){
        return assayBlipService.findMealBlip();
    }
    @RequestMapping("delMealBlip")
    public void delMealBlip(@RequestBody AssayMeal assayMeal){
        assayBlipService.delMealBlip(assayMeal);
    }
    @GetMapping("abc")
    public String sss(){
        return "中国安踏";
    }
}

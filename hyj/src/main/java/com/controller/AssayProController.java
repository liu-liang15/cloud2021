package com.controller;

import com.model.serveices.AssayMealService;
import com.model.serveices.AssayProService;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPro;
import com.pojos.hyj.AssayType;
import com.pojos.system.KeShi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hyj/")
public class AssayProController {
    @Autowired
    AssayProService assayProService;
    @Autowired
    AssayMealService assayMealService;
    @RequestMapping("findAll")
    public List<AssayPro> findAll(){
        return assayProService.findAll();
    }
    @RequestMapping("del")
    public String del(@RequestBody AssayPro assayPro){
        assayProService.del(assayPro);
        return "ok";
    }
    @RequestMapping("update")
    public String update(@RequestBody AssayPro assayPro){
        assayProService.update(assayPro);
        return "ok";
    }
    @RequestMapping("findById")
    public AssayPro findById(@RequestBody AssayPro assayPro){
        return assayProService.findById(assayPro);
    }
    @RequestMapping("insert")
    public void insert(@RequestBody AssayPro assayPro){
        assayProService.insert(assayPro);
    }
    //模糊查询项目列表
    @RequestMapping("likeData")
    public List<AssayPro> likeData(@RequestBody AssayPro assayPro){
        return assayProService.likeData(assayPro);
    }
    //查询项目类型
    @RequestMapping("findType")
    public List<AssayType> findType(){
        return assayProService.findType();
    }
    //查询化验项目
    @RequestMapping("findMeal")
    public List<AssayMeal> findMeal(){
        return assayMealService.findMeal();
    }
    //新增化验项目
    @RequestMapping("addMeal")
    public void addMeal(@RequestBody AssayMeal assayMeal){
        assayMealService.addMeal(assayMeal);
    }
    //删除套餐表和中间表
    @RequestMapping("delMeal")
    public void delMeal(@RequestBody AssayMeal assayMeal){
        assayMealService.delMeal(assayMeal);
    }
    //查询执行科室
    @RequestMapping("findKs")
    public List<KeShi> findKs(){
        return assayProService.findKs();
    }
    //模糊查询套餐
    @RequestMapping("likeFind")
    public List<AssayMeal> likeFind(@RequestBody AssayMeal assayMeal){
        return assayMealService.likeFind(assayMeal);
    }

    @RequestMapping("findAllMeal")
    public List<AssayMeal> findAllMeal(){
        return assayMealService.findAllMeal();
    }
}

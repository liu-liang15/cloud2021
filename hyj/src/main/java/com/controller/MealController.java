package com.controller;

import com.model.serveices.MealService;
import com.pojos.hyj.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("hyj/")
public class MealController {
    @Autowired
    MealService mealService;
    @RequestMapping("fMeal")
    public List<Meal> fMeal(){
        return mealService.fMeal();
    }
    @RequestMapping("fMealById")
    public List<Meal> fMealById(@RequestBody Meal meal){
        return mealService.fMealById(meal);
    }
    @RequestMapping("insertMeal")
    public void insertMeal(@RequestBody Meal meal){
        mealService.insertMeal(meal);
    }
    @RequestMapping("delMeals")
    public void delMeals(@RequestBody Meal meal){
        mealService.delMeals(meal);
    }
}

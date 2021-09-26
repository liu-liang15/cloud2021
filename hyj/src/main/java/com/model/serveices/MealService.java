package com.model.serveices;

import com.model.dao.MealMapper;
import com.pojos.hyj.Meal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MealService {
    @Resource
    MealMapper mealMapper;
    public List<Meal> fMeal(){
        return mealMapper.fMeal();
    }
    public List<Meal> fMealById(Meal meal){
        return mealMapper.fMealById(meal);
    }
    public void insertMeal(Meal meal){
        mealMapper.insertMeal(meal);
        mealMapper.insertMealMiddle(meal.getMealId(),meal.getAssayMeals());
    }
    public void delMeals(Meal meal){
        mealMapper.delMeals(meal);
        mealMapper.delMiddles(meal);
    }
}

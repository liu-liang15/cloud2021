package com.model.dao;

import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.Meal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MealMapper {
    public List<Meal> fMeal();

    public List<Meal> fMealById(Meal meal);

    public void insertMeal(Meal meal);

    public void insertMealMiddle(@Param("mealId")int mealId,@Param("list")List<AssayMeal> assayMeals);

    public void delMeals(Meal meal);

    public void delMiddles(Meal meal);
}

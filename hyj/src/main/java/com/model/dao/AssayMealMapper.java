package com.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPro;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssayMealMapper extends BaseMapper<AssayMeal> {
    public List<AssayMeal> findMeal();

    public void addMeal(AssayMeal assayMeal);

    public void addMiddle(@Param("mealId") int mealId,@Param("list") List<AssayPro> assayPros);

    public void delMiddle(AssayMeal assayMeal);

    public void delMeal(AssayMeal assayMeal);

    public List<AssayMeal> findAllMeal();
}

package com.model.dao;

import com.pojos.hyj.AssayMealImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MealImgMapper {
    void addImg(@Param("list")List<AssayMealImg> mealImgList);
}

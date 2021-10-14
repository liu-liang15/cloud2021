package com.model.dao;

import com.pojos.hyj.AssayMealImg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MealImgMapper {
    void addImg(AssayMealImg assayMealImg);
}

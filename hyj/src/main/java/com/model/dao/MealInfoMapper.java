package com.model.dao;

import com.pojos.hyj.AssayMealImg;
import com.pojos.hyj.AssayRes;
import com.pojos.hyj.MealInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MealInfoMapper {
    void addMealInfor(MealInfo mealInfo);
    void addMealRes(@Param("list")List<AssayRes> assayRes);
    List<MealInfo> findMealOk(MealInfo mealInfo);
    List<AssayRes> findResInfo(AssayRes assayRes);
    void addInfoImg(@Param("list") List<AssayMealImg> assayMealImgs);
    List<MealInfo> findImgInfo(MealInfo mealInfo);
}

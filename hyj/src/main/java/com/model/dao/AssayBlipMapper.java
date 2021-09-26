package com.model.dao;

import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayMealBlip;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AssayBlipMapper {

    void addMealBlip(AssayMealBlip assayMealBlip);

    List<AssayMealBlip> findMealBlip();

    void delMealBlip(AssayMeal assayMeal);
}

package com.model.dao;

import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPerson;
import com.pojos.hyj.AssayRes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssayResMapper {
    public List<AssayPerson> findRes(AssayPerson assayPerson);
    public List<AssayMeal> findMealPro(AssayMeal assayMeal);
    public List<AssayInfo> findPersonRes();
    public List<AssayMeal> findEnterRes(AssayMeal assayMeal);
    public void addRes(@Param("list") List<AssayRes> assayRes);
    public void editOneK(int assayPersonId);
    public void editZeroK(int assayPersonId);
    public void delPersonRes(AssayRes assayRes);
    void editKeyboarder(AssayInfo assayInfo);
    List<AssayMeal> findKsByMeal(AssayMeal assayMeal);
}

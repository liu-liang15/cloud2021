package com.example.model.dao.inpatient;


import com.pojos.inpatient.ResMeal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResMealDao {
    //新增检验项目
    public void addResMeal(ResMeal resMeal);
}

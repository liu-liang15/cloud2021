package com.example.model.dao.inpatient;


import com.pojos.inpatient.ConsApp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ConsAppDao {
    //新增住院手术申请单
    public void addConsApp(ConsApp consApp);
    //查看手术申请单
    public List<ConsApp> selConsApp(@Param("surName")String surName,@Param("name")String name,@Param("conZt")String conZt);
    //修改手术申请单
    public void changeCons(ConsApp consApp);
    //查看手术申请单中根据手术编号
    public List<ConsApp> selConsBySurNo(String SurNo);
}

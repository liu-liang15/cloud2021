package com.example.model.dao.inpatient;


import com.pojos.inpatient.SurItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SurItemDao {
    //新增手术项目
    public void addSur(SurItem surItem);
    //查看手术项目
    public List<SurItem> selSur(@Param("param") String param,@Param("ksId")String ksId,@Param("surNo")String surNo);
    //修改手术项目
    public void upDateSur(SurItem surItem);
    //根据手术名查看手术项目
    public SurItem selSurBySurName(String surName);
}

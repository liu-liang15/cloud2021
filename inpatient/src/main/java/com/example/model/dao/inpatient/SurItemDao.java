package com.example.model.dao.inpatient;


import com.pojos.inpatient.SurItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SurItemDao {
    //新增手术项目
    public void addSur(SurItem surItem);
    //查看手术项目
    public List<SurItem> selSur();
    //修改手术项目
    public void upDateSur(SurItem surItem);
}

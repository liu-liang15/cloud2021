package com.example.model.dao.inpatient;


import com.pojos.inpatient.OpeCzRec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OpeCzRecDao {
    //新增手术室操作记录
    public void addOpeCz(OpeCzRec opeCzRec);
    //查看手术室操作记录
    public List<OpeCzRec> selOpeCz();
}

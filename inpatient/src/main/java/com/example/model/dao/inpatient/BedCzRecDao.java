package com.example.model.dao.inpatient;


import com.pojos.inpatient.BedCzRec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BedCzRecDao {
    //新增床位操作记录
    public void addBedRec(BedCzRec bedCzRec);
    //查询床位操作记录
    public List<BedCzRec> selBedCzRec();
}

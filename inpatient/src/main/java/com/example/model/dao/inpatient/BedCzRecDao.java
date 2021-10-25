package com.example.model.dao.inpatient;


import com.pojos.inpatient.BedCzRec;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BedCzRecDao {
    //新增床位操作记录
    public void addBedRec(BedCzRec bedCzRec);
    //多条件查询床位操作记录
    public List<BedCzRec> selBedCzRec(@Param("wardName")String wardName,@Param("bedCzTime1")String bedCzTime1,
                                      @Param("bedCzTime2")String bedCzTime2,@Param("czType")String czType);
}

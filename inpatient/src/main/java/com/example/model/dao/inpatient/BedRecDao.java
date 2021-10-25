package com.example.model.dao.inpatient;


import com.pojos.inpatient.Bed;
import com.pojos.inpatient.BedRec;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BedRecDao {
    //新增床位记录
    public void addBedRec(Bed bed);
    //查看床位记录
    public List<BedRec> selBedRec(@Param("name")String name,@Param("wardName")String wardName,@Param("bedTime1")String bedTime1,@Param("bedTime2")String bedTime2);
}

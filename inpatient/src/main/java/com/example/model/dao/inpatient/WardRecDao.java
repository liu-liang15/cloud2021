package com.example.model.dao.inpatient;


import com.pojos.inpatient.WardRec;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WardRecDao {
    //新增病房操作记录
    public void addWardRec(WardRec wardRec);
    //查询病房操作记录
    public List<WardRec> selWardRec(@Param("wardName")String wardName, @Param("wardCzTime1")String wardCzTime1,
                                    @Param("wardCzTime2")String wardCzTime2, @Param("czType")String czType);
}

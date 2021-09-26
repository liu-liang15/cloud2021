package com.example.model.dao.inpatient;


import com.pojos.inpatient.WardRec;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface WardRecDao {
    //新增病房操作记录
    public void addWardRec(WardRec wardRec);
    //查询病房操作记录
    public List<WardRec> selWardRec();
}

package com.example.model.dao.inpatient;


import com.pojos.inpatient.ExpCal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExpCalDao {
    //查看消费记录
    public List<ExpCal> selExpCal(String param);
    //新增消费记录
    public void addExpCal(ExpCal expCal);
}

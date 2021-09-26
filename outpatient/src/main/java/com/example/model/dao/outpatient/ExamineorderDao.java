package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Examinedetails;
import com.pojos.outpatient.Examineorder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExamineorderDao extends BaseMapper<Examineorder> {
    void insertExamineorder(Examineorder examineorder);

    void insertExaminedetails(Examinedetails examinedetails);
}

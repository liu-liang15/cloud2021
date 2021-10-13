package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Examinedetails;
import com.pojos.outpatient.Examineorder;
import com.pojos.outpatient.Labworkdetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExamineorderDao extends BaseMapper<Examineorder> {
    void insertExamineorder(Examineorder examineorder);

    void insertExaminedetails(@Param("jianchadan") int jianchadan,@Param("jianchaid") String jianchaid,@Param("count") int count,@Param("price") double price);
}

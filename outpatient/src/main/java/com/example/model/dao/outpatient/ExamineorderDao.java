package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Examinedetails;
import com.pojos.outpatient.Examineorder;
import com.pojos.outpatient.Labworkdetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExamineorderDao extends BaseMapper<Examineorder> {
    void insertExamineorder(Examineorder examineorder);

    void insertExaminedetails(@Param("jianchadan") int jianchadan,@Param("jianchaid") String jianchaid,@Param("count") int count,@Param("price") double price);

    //根据门诊删除处方检查详单状态为1的数据
    void deljccfddzt1(String param);

    List<Examinedetails> selectjcxqzt1(String param);

    Examineorder selectjcdd(String param);

    void updatecfjcddzjg(@Param("jg") double jg,@Param("mzhao") String mzhao);
}

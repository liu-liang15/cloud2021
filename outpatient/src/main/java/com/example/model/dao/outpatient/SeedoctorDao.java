package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Mzshoushujieguo;
import com.pojos.outpatient.Seedoctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SeedoctorDao extends BaseMapper<Seedoctor> {
    List<Seedoctor> findseedoctor(int param);

    void insertJiuZhenJiLu(Seedoctor seedoctor);

    List<Seedoctor> selectInfoRes(String mzhao);

    List<Mzshoushujieguo> selectmzshoushujieguo(String mzhao);

    void updatemzshoushujieguo(@Param("jieguo") String jieguo,@Param("no") int no);

    void insertmzshoushujieguo(Mzshoushujieguo mzshoushujieguo);
}

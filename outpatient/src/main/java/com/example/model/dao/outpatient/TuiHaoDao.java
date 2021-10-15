package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Tuihao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TuiHaoDao extends BaseMapper<Tuihao> {
    List<Tuihao> findAllTuiHao(@Param("mzhao") String mzhao,@Param("sj1") String sj1,@Param("sj2") String sj2);
    void insertTuiHao(Tuihao tuihao);

}

package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Hospregcate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HospregcateDao extends BaseMapper<Hospregcate> {
    //查询所有挂号记录
    List<Hospregcate> findAllHopregcate();
}

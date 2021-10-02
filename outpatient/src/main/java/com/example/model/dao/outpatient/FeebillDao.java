package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.pojos.outpatient.Feebill;
import java.util.List;

@Mapper
public interface FeebillDao extends BaseMapper<Feebill> {
    List<Feebill> findFeebillByNo();
    List<Feebill> findAllDFYP();
}

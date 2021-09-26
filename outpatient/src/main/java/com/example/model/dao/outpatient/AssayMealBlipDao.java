package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.AssayMealBlip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssayMealBlipDao extends BaseMapper<AssayMealBlip> {
    List<AssayMealBlip> findBlip();
}

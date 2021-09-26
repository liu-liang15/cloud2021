package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Assay;
import com.pojos.outpatient.Labworkdetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssayDao extends BaseMapper<Assay> {
    void insertAssayCF(Assay assay);

    void insertLabworkdetailsCF(Labworkdetails l);
}

package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssayDao extends BaseMapper<Assay> {
    void insertAssayCF(Assay assay);

    void insertLabworkdetailsCF(Labworkdetails l);
    //根据门诊删除处方检验详单状态为1的数据
    void deljycfddzt1(String param);

    List<Labworkdetails> selectjyxqzt1(String param);

    Assay selectjydd(String param);

    void updatecfjyddzjg(@Param("jg") double jg,@Param("mzhao") String mzhao);
}

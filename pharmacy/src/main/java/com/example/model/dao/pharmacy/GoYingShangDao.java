package com.example.model.dao.pharmacy;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.pharmacy.GoYingShang;
import com.pojos.pharmacy.Hibernate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoYingShangDao extends BaseMapper<GoYingShang> {
    //查询所有供应商
    List<GoYingShang> findAll(Hibernate hibernate);
    //新增供应商

    void insert2(GoYingShang goYingShang);
    //修改供应商信息
    void update(GoYingShang goYingShang);
    int findId(@Param("name") String name);
}

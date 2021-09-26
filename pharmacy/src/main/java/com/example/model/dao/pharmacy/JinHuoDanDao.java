package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.CaiGoJh;
import com.pojos.pharmacy.JhXiangDan;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper
public interface JinHuoDanDao {
    //新增采购计划单
    void addJHD(CaiGoJh caiGoJh);
    //批量新增采购计划详单
    void addJHXD(Collection<JhXiangDan> jhXiangDan, String planId);
    //查询采购计划单
     List<CaiGoJh> findAllJHD();
     //查询采购计划详单
     List<JhXiangDan> findAllJHXD(String planId);
}

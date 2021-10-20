package com.model.dao;

import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayPay;
import com.pojos.hyj.AssayPerson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssayInfoMapper {
    void addAssayInfo(AssayInfo assayInfo);
    void editPersonK(AssayInfo assayInfo);
    List<AssayInfo> selectInfo();
    void addPay(AssayPay assayPay);
    void addMealInfo(AssayInfo assayInfo);
    List<AssayInfo> findMealInfo();
    List<AssayInfo> findAssayInfoById(AssayInfo assayInfo);
    List<AssayInfo> findInfoLikeBy(@Param("tc") String tc);
    List<AssayInfo> findInfoLikeBy2(@Param("xm1") String xm1);
    List<AssayInfo> findInfoLikeBy3(@Param("xm2") String xm2);
}

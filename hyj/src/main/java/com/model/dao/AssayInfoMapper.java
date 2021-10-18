package com.model.dao;

import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayPay;
import com.pojos.hyj.AssayPerson;
import org.apache.ibatis.annotations.Mapper;

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
}

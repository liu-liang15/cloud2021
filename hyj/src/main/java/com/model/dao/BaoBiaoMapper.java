package com.model.dao;

import com.pojos.hyj.AssayPay;
import com.pojos.inpatient.ExpCal;
import com.pojos.outpatient.Feebill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BaoBiaoMapper {
    List<Feebill> findFeebMoney(@Param("MTime") String MTime);
    List<ExpCal> findZMoney(@Param("ZTime") String ZTime);
    List<AssayPay> findPayMoney(@Param("TTime") String TTime);
}

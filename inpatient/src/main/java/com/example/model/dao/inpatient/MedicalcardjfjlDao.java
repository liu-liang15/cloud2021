package com.example.model.dao.inpatient;


import com.pojos.inpatient.Medicalcardjfjl;
import com.pojos.outpatient.Medicalcardczjl;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicalcardjfjlDao {
    //新增缴费记录
    public void addJfjl(Medicalcardjfjl med);
    //查询缴费记录
    public List<Medicalcardjfjl> selPay(Medicalcardjfjl med);
    //诊疗卡记录
    public void addMedicalcardCzjl(Medicalcardczjl medicalcardczjl);
    //修改卡余额
    public void updatePat(@Param("mediBalance") double mediBalance, @Param("mediNo") Integer mediNo);
}

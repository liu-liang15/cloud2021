package com.example.model.dao.inpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.inpatient.AdmNot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdmNotDao extends BaseMapper<AdmNot> {
    //查询住院通知单
    public List<AdmNot> selAdm(String param);
    //修改住院通知单状态
    public void alterAdm(String hosNo);
    //新增住院通知单
    public void addAdm(AdmNot admNot);
    //根据诊疗卡号查询住院登记单
    public List<AdmNot> selByPatient(String param);
}

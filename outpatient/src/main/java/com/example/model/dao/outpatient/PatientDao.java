package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PatientDao extends BaseMapper<Patient> {
    //查询
    List<Patient> findAllPatient(String param);
    //新增
    void insertPatient(Patient patient);
    //修改
    void updatePatient(Patient patient);
}

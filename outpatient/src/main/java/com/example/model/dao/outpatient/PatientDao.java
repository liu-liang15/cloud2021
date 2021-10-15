package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PatientDao extends BaseMapper<Patient> {
    //查询
    List<Patient> findAllPatient(@Param("name") String name,@Param("idcard") String idcard,@Param("phone") String phone,@Param("sex") String sex);
    //新增
    void insertPatient(Patient patient);
    //修改
    void updatePatient(Patient patient);
}

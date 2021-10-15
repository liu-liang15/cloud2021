package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Medicalcardzt;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicalcardztDao extends BaseMapper<Medicalcardzt> {
    List<Medicalcardzt> findAllMedicalcardzt(@Param("zlkhao") String zlkhao, @Param("sj1") String sj1,@Param("sj2") String sj2);
    void save(Medicalcardzt medicalcardzt);

}

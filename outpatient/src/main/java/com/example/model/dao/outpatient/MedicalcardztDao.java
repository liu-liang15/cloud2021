package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Medicalcardzt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalcardztDao extends BaseMapper<Medicalcardzt> {
    List<Medicalcardzt> findAllMedicalcardzt(String param);
    void save(Medicalcardzt medicalcardzt);

}

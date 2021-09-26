package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Medicalcardczjl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalcardCzjlDao extends BaseMapper<Medicalcardczjl> {
    //查询充值记录
    List<Medicalcardczjl> findAllMedicalcardCzjl(String param);

    //新增充值记录
    void addMedicalcardCzjl(Medicalcardczjl medicalcardczjl);
}

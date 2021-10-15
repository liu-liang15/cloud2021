package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Medicalcardczjl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicalcardCzjlDao extends BaseMapper<Medicalcardczjl> {
    //查询充值记录
    List<Medicalcardczjl> findAllMedicalcardCzjl(@Param("zlkhao")String zlkhao,@Param("name")String name,@Param("idcard")String idcard,@Param("phone")String phone,@Param("zffs")String zffs,@Param("sj1")String sj1,@Param("sj2") String sj2);

    //新增充值记录
    void addMedicalcardCzjl(Medicalcardczjl medicalcardczjl);
}

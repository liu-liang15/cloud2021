package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Medicalcard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicalcardDao extends BaseMapper<Medicalcard> {
    //查询诊疗卡
    List<Medicalcard> findAllMedicalcard(String param);

    //根据诊疗卡卡号查询信息
    List<Medicalcard> findMedicalcardByMediCard(String mediCard);

    //新增诊疗卡
    void addMedicalcard(Medicalcard medicalcard);

    void medicalcardTY(int mediNo,String mediState);

    void medicalcardBB(int mediNo,String mediCard);

    void editPwd(int mediNo,String mediPassword);

    //修改卡余额
    void updatePat(@Param("mediBalance") double mediBalance,@Param("mediNo") Integer mediNo);

}

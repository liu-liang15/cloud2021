package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Buka;
import com.pojos.outpatient.Medicalcard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MedicalcardDao extends BaseMapper<Medicalcard> {
    //查询诊疗卡
    List<Medicalcard> findAllMedicalcard(@Param("zlkhao") String zlkhao,@Param("name")String name,@Param("idcard")String idcard,@Param("phone")String phone);

    //根据诊疗卡卡号查询信息
    List<Medicalcard> findMedicalcardByMediCard(String mediCard);

    //新增诊疗卡
    void addMedicalcard(Medicalcard medicalcard);

    void medicalcardTY(@Param("mediNo")int mediNo,@Param("mediState")String mediState);

    //补卡
    void medicalcardBB(@Param("mediNo") int mediNo,@Param("mediCard")String mediCard);

    //新增补卡记录
    void insertBuka(Buka buka);

    //查询补卡记录
    List<Buka> selectBuKa(@Param("name")String name,@Param("idcard")String idcard,@Param("zlkhao")String zlkhao,@Param("sj1")String sj1,@Param("sj2")String sj2);

    void editPwd(@Param("mediNo")int mediNo,@Param("mediPassword")String mediPassword);

    //修改卡余额
    void updatePat(@Param("mediBalance") double mediBalance,@Param("mediNo") Integer mediNo);

}

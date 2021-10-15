package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Prescription;
import com.pojos.outpatient.Prescriptiondetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PrescriptionDao extends BaseMapper<Prescription> {
    void insertChufang(Prescription p);

    void insertChufangXQ(Prescriptiondetails p);

    //根据门诊删除处方药品详单状态为1的数据
    void delypypddzt1(String param);

    void updatecfypddzjg(@Param("jg") double jg,@Param("mzhao") String mzhao);

    List<Prescriptiondetails> selectypxqzt1(String param);

    Prescription selectypdd(String param);
}

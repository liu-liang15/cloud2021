package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.FeebillDetails;
import com.pojos.outpatient.Payment;
import org.apache.ibatis.annotations.Mapper;
import com.pojos.outpatient.Feebill;
import org.apache.ibatis.annotations.Param;

import java.text.ParseException;
import java.util.List;

@Mapper
public interface FeebillDao extends BaseMapper<Feebill> {
    List<Feebill> findFeebillByNo();
    List<Feebill> findAllDFYP();
    //查询缴费记录
    List<Payment> selJiaoFeiJiLu(@Param("mzhao")String mzhao,@Param("name")String name,@Param("idcard")String idcard,@Param("phone")String phone,@Param("zffs")String zffs,@Param("sj1")String sj1,@Param("sj2") String sj2);
        //查询缴费记录详情
    List<FeebillDetails> selJiaoFeiJiLuXq(String param);
}

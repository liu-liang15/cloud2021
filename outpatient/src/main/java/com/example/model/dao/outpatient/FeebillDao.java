package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.FeebillDetails;
import com.pojos.outpatient.Payment;
import org.apache.ibatis.annotations.Mapper;
import com.pojos.outpatient.Feebill;
import java.util.List;

@Mapper
public interface FeebillDao extends BaseMapper<Feebill> {
    List<Feebill> findFeebillByNo();
    List<Feebill> findAllDFYP();
    //查询缴费记录
    List<Payment> selJiaoFeiJiLu(String param);
    //查询缴费记录详情
    List<FeebillDetails> selJiaoFeiJiLuXq(String param);
}

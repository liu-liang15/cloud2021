package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.hyj.AssayPay;
import com.pojos.outpatient.Feebill;
import com.pojos.outpatient.FeebillDetails;
import com.pojos.outpatient.Payfees;
import com.pojos.outpatient.PayfeesDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PayfeesDao extends BaseMapper<Payfees> {
    List<Payfees> selJiuZhenZJG(@Param("mzhao") String mzhao,@Param("name") String name,@Param("idcard") String idcard,@Param("phone") String phone);

    void insertFeebill(Feebill feebill);
    void insertFeebillDetails(FeebillDetails feebillDetails);

    void updatePayZtYp(String param);
    void updatePayZtHy(String param);
    void updatePayZtJc(String param);
    void updatePayZtSs(String param);

    void updateXdZtSs(String param);
    void updateXdZtJy(String param);
    void updateXdZtJc(String param);
    void updateXdZtYp(String param);

    List<PayfeesDetails> findpaycf(String param);
    List<PayfeesDetails> findpayhy(String param);
    List<PayfeesDetails> findpayjc(String param);
    List<PayfeesDetails> findpayss(String param);

    List<FeebillDetails> findId(String id);
    //体检新增缴费记录
    void tjaddjfd(AssayPay assayPay);
}

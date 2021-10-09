package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Feebill;
import com.pojos.outpatient.FeebillDetails;
import com.pojos.outpatient.Payfees;
import com.pojos.outpatient.PayfeesDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayfeesDao extends BaseMapper<Payfees> {
    List<Payfees> selJiuZhenZJG(String param);

    void insertFeebill(Feebill feebill);
    void insertFeebillDetails(FeebillDetails feebillDetails);

    void updatePayZtYp(String param);
    void updatePayZtHy(String param);
    void updatePayZtJc(String param);
    void updatePayZtSs(String param);

    List<PayfeesDetails> findpaycf(String param);
    List<PayfeesDetails> findpayhy(String param);
    List<PayfeesDetails> findpayjc(String param);
    List<PayfeesDetails> findpayss(String param);
}

package com.example.model.dao.inpatient;


import com.pojos.inpatient.Medicalcardjfjl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalcardjfjlDao {
    //新增缴费记录
    public void addJfjl(Medicalcardjfjl med);
    //查询缴费记录
    public List<Medicalcardjfjl> selPay(Medicalcardjfjl med);
}

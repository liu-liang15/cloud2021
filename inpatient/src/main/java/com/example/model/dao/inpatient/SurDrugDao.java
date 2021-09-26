package com.example.model.dao.inpatient;


import com.pojos.inpatient.SurDrug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SurDrugDao {
    //新增手术药品
    public void addSurDrug(SurDrug surDrug);
    //删除手术药品
    public void delSurDrug(long param);
    //查看对应手术药品
    public List<SurDrug> selSurDrug(long param);
}

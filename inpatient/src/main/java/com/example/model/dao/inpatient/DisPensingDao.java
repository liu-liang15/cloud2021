package com.example.model.dao.inpatient;

import com.pojos.inpatient.Dispensing;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DisPensingDao {
    //新增发药单
    public void addDis(Dispensing dispensing);
}

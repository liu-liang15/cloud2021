package com.example.model.dao.inpatient;

import com.pojos.inpatient.DispensingXq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DispensingXqDao {
    //新增发药单详情
    public void addDisXq(DispensingXq dispensingXq);

}

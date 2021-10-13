package com.example.model.dao.inpatient;

import com.pojos.inpatient.Dispensing;
import com.pojos.inpatient.DispensingXq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DispensingXqDao {
    //新增发药单详情
    public void addDisXq(DispensingXq dispensingXq);
    //查看发药详单
    public List<DispensingXq> selDisXq(String param);

}

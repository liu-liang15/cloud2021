package com.example.model.dao.inpatient;

import com.pojos.inpatient.Dispensing;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DisPensingDao {
    //新增发药单
    public void addDis(Dispensing dispensing);
    //查询发药单
    public List<Dispensing> selDis(String param);
    //修改发药单
    public void changeDis(Dispensing dispensing);
}

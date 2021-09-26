package com.example.model.dao.inpatient;


import com.pojos.inpatient.SurXh;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SurXhDao {
    //新增手术耗材
    public void addSurxh(SurXh surXh);
    //查看手术耗材
    public List<SurXh> selSurxh(int param);
    //删除手术耗材
    public void delSurxh(long param);
}

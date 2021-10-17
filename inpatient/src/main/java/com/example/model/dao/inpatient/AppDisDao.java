package com.example.model.dao.inpatient;

import com.pojos.inpatient.AppDis;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppDisDao {
    //新增出院通知单
    public void addAppDis(AppDis appDis);
    //查看出院通知单
    public List<AppDis> selAppDis(String param);
    //修改住院通知单为已登记
    public void changeAppDis(AppDis appDis);
}

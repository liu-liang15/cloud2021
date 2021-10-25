package com.example.model.dao.inpatient;

import com.pojos.inpatient.AppDis;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AppDisDao {
    //新增出院通知单
    public void addAppDis(AppDis appDis);
    //查看出院通知单
    public List<AppDis> selAppDis(String param);
    //多条件查看出院通知单
    public List<AppDis> selAppByAll(@Param("name")String name, @Param("idcart")String idcart,
                                    @Param("appDisNo")String appDisNo, @Param("outDate1")String outDate1,
                                    @Param("outDate2")String outDate2, @Param("appZt")String appZt);
    //修改住院通知单为已登记
    public void changeAppDis(AppDis appDis);
    //根据住院单编号查看住院通知单
    public AppDis selAppDisByResNo(String resNo);
}

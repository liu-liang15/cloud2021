package com.example.model.dao.inpatient;

import com.pojos.inpatient.Bed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BedDao {
    //查看床位
    public List<Bed> selBed(@Param("wardNo") String wardNo, @Param("zt")String zt);
    //新增床位
    public void addBed(Bed bed);
    //查看患者的床位
    public List<Bed> allocBed(String param);
    //多条件查看患者床位
    public List<Bed> selBedByAll(@Param("wardName")String wardName,@Param("name")String name,
                                 @Param("resNo")String resNo,@Param("bedZt")String bedZt);
    //修改床位
    public void updateBed(Bed bed);
    //查看住院单详情
    public List<Bed> hosXq(String param);
    //根据住院单号查看床位
    public Bed selBed2(Bed bed);
    //空出床位
    public void bedEmpty(String param);
    //查询有床位的患者
    public List<Bed> selHasBed();
}

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
    //查看患者与床位
    public List<Bed> allocBed(String param);
    //修改床位
    public void updateBed(Bed bed);
    //查看住院单详情
    public List<Bed> hosXq(String param);
    //根据住院单号查看床位
    public Bed selBed2(Bed bed);
}

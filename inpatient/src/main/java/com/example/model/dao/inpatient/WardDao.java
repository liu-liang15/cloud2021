package com.example.model.dao.inpatient;


import com.pojos.inpatient.Ward;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WardDao {
    //新增病房
    public void addWard(Ward ward);
    //查看病房
    public List<Ward> selWard(String param);
    //多条件查看病房
    public List<Ward> selWardByAll(@Param("wardName")String wardName,@Param("ksId")String ksId,@Param("wardZt")String wardZt);
    //修改病房
    public void updateWard(Ward ward);
    //按病房名称查看病房
    public Ward selWardByName(String param);

    public Ward selWardByNameAndNo(Ward ward);
}

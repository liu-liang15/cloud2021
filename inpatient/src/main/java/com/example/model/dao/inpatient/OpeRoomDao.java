package com.example.model.dao.inpatient;


import com.pojos.inpatient.OpeRoom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OpeRoomDao {
    //新增手术室
    public void addRoom(OpeRoom opeRoom);
    //查看手术室
    public List<OpeRoom> selRoom(@Param("param") String param,@Param("ksId")String ksId,@Param("zt")String zt);
    //修改手术室
    public void upDateRoom(OpeRoom opeRoom);
}

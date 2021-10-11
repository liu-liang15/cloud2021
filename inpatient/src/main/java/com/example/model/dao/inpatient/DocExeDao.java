package com.example.model.dao.inpatient;


import com.pojos.inpatient.DocExe;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DocExeDao {
    //新增待执行医嘱
    public void addDocExe(String param);
    //查看所有医嘱
    public List<DocExe> selDocExe(@Param("param") String param,@Param("type")  int type);
    //查看是否有今天医嘱
    public List<DocExe> nowDocExe(String param);
    //修改今天医嘱为已执行
    public void upDateDocExe(DocExe docExe);

}

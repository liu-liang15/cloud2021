package com.example.model.dao.inpatient;


import com.pojos.inpatient.DocAdvXq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocAdvXqDao {
    //新增医嘱详单
    public void addDocAdvXq(DocAdvXq docAdvXq);
    //查看医嘱详单
    public List<DocAdvXq> selDocAdvXq(String param);
    //查看对应患者的医嘱详情
    public List<DocAdvXq> serDocAdvXq(String param);
    //修改医嘱详单
    public void upDateDocAdvXq(DocAdvXq docAdvXq);
}

package com.example.model.dao.inpatient;


import com.pojos.inpatient.DocAdv;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocAdvDao {
    //新增医嘱
    public void addDocAdv(DocAdv docAdv);
    //查看医嘱
    public List<DocAdv> selDocAdv(String param);
}

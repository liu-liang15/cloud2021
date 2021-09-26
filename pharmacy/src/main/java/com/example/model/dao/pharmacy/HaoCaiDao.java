package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.HaoCai;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HaoCaiDao {
    //查看消耗品规格
    public List<HaoCai> selHCName();
    //查看对应规格
    public List<HaoCai> selHCMatr(String param);

}

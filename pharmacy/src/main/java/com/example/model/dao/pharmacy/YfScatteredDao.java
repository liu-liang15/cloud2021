package com.example.model.dao.pharmacy;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface YfScatteredDao {
    int sum(int id);
    void addscattered(@Param("id")int id,@Param("number")int number);
    void editscattered1(@Param("number")int number,@Param("id")int id);
    void editscattered2(@Param("number")int number,@Param("id")int id);
    String matr(int id);
    int scatteredSum(int id);
}

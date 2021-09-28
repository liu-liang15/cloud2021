package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.FaYao;
import com.pojos.pharmacy.FaoYaoXd;
import com.pojos.pharmacy.YpYaoFang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface YaoFangDao {
    //药库调拨药品到药房增加数量
    void addDrugNumber(@Param("drugId")int drugId,@Param("drugNumber")int drugNumber);
    //查询药房药品
    List<YpYaoFang> findAllYFYP();
    void reduceDrugNumber(@Param("drugNumber")int drugNumber,@Param("drugId")int drugId);
    void updateFYD(@Param("id")String id);
    void updateFYXD(@Param("id")String id);
    int sum1(@Param("id")String id);
    int sum2(@Param("id")String id);
    void addFYD(FaYao faYao);
    void addFYXD(Collection<FaoYaoXd> faoYaoXds, String fyId);
}

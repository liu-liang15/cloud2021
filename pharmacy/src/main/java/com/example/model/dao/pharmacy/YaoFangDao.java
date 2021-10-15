package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.FaYao;
import com.pojos.pharmacy.FaoYaoXd;
import com.pojos.pharmacy.YpYaoFang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Mapper
public interface YaoFangDao {
    //药库调拨药品到药房增加数量
    void addDrugNumber(@Param("drugId")int drugId,@Param("drugNumber")int drugNumber);
    //查询药房药品
    List<YpYaoFang> findAllYFYP();
    void reduceDrugNumber(@Param("drugNumber")int drugNumber,@Param("drugId")int drugId);
    //修改缴费单状态为已完成
    void updateFYD(@Param("id")String id);
    //修改缴费详单状态为已完成
    void updateFYXD(@Param("id")String id);
    //查询某门诊缴费单内所有项目数量
    int sum1(@Param("id")String id);
    //查询某门诊缴费单内所有已完成的项目数量
    int sum2(@Param("id")String id);
    //新增发药记录
    void addFYD(FaYao faYao);
    //新增发药记录详单
    void addFYXD(@Param("faoYaoXds") Collection<FaoYaoXd> faoYaoXds,@Param("fyId") String fyId);
    //修改短期医嘱执行状态
    void changeDis(@Param("userId")String userId,@Param("disId")String disId);
}

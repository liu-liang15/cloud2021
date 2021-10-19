package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.RkXiangDan;
import com.pojos.pharmacy.RuKu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Mapper
public interface RuKuDao {
    void addRKD(RuKu ruKu);
    void addRKXD(@Param("rkXiangDans") Collection<RkXiangDan> rkXiangDans,@Param("rkDh") String rkDh,@Param("wareId")int wareId);
    void addKC(@Param("kucun")Collection<RkXiangDan> kucun);
    void updateOrder(@Param("purchaseSjfk")String purchaseSjfk,@Param("times")Date times,@Param("purchaseId") String purchaseId);
    List<RkXiangDan> FindByIdRuku(String rhDh);
}

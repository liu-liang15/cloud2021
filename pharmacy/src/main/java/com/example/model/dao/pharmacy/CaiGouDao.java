package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.CgDingDan;
import com.pojos.pharmacy.CgddXiangDan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CaiGouDao {
void addCGD(CgDingDan cgDingDan);
void addCGXD(@Param("cgddXiangDans") Collection<CgddXiangDan> cgddXiangDans,@Param("purchaseId") String purchaseId);

    //查询采购计划单
    List<CgDingDan> findAllCGD();
    //查询采购计划详单
    List<CgddXiangDan> findAllCGXD(String purchaseId);
    //查询所有待审核和待收货的订单
    List<CgDingDan> findByIdCGD1();
    //查询所有待入库的订单
    List<CgDingDan> findByIdCGD2();

    //根据订单id修改订单状态
    void editState(@Param("stateId") String stateId,@Param("purchaseId")String purchaseId);

}

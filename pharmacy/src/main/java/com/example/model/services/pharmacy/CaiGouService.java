package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.CaiGouDao;
import com.pojos.pharmacy.CgDingDan;
import com.pojos.pharmacy.CgddXiangDan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CaiGouService {
    @Autowired
    CaiGouDao caiGouDao;
    public void addCaiGou(CgDingDan cgDingDan) {
        System.out.println("进入service");
        System.out.println(cgDingDan.getSupplyId());
        caiGouDao.addCGD(cgDingDan);
        caiGouDao.addCGXD(cgDingDan.getCgddXiangDans(), cgDingDan.getPurchaseId());
    }
    //查询采购计划单
    public  List<CgDingDan> findAllCGD(){
        return caiGouDao.findAllCGD();
    }
    //查询采购计划详单
    public  List<CgddXiangDan> findAllCGXD(String purchaseId) {
        return caiGouDao.findAllCGXD(purchaseId);
    }
    //查询所有待审核和待收货的订单
   public List<CgDingDan> findByIdCGD1(){
        return caiGouDao.findByIdCGD1();
   }
    //查询所有待入库的订单
   public List<CgDingDan> findByIdCGD2(){
       return caiGouDao.findByIdCGD2();
   }

    //根据订单id修改订单状态
   public void editState(String stateId,String purchaseId){
        caiGouDao.editState(stateId,purchaseId);
   }

}

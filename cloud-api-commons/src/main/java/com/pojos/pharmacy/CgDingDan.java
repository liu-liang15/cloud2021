package com.pojos.pharmacy;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.pojos.system.YuanGo;

import java.util.Collection;
import java.util.Date;

public class CgDingDan {
  private String purchaseId;
  private String planId;
  private String supplyId;
  private String userId;
  private Date purchaseTime = new Date();
  private double purchasePrice;
  private double purchaseSjfk;
  private String purchaseFukuang;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
  private Date purchaseFksj;
  private String purchaseState;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
  private Date purchaseJhsj;
  private Collection<CgddXiangDan> cgddXiangDans;
  private GoYingShang goYingShangs;
  private YuanGo yuanGo;

  public YuanGo getYuanGo() {
    return yuanGo;
  }

  public void setYuanGo(YuanGo yuanGo) {
    this.yuanGo = yuanGo;
  }

  public GoYingShang getGoYingShangs() {
    return goYingShangs;
  }

  public void setGoYingShangs(GoYingShang goYingShangs) {
    this.goYingShangs = goYingShangs;
  }

  public Collection<CgddXiangDan> getCgddXiangDans() {
    return cgddXiangDans;
  }

  public void setCgddXiangDans(Collection<CgddXiangDan> cgddXiangDans) {
    this.cgddXiangDans = cgddXiangDans;
  }

  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public String getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }


  public String getSupplyId() {
    return supplyId;
  }

  public void setSupplyId(String supplyId) {
    this.supplyId = supplyId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Date getPurchaseTime() {
    return purchaseTime;
  }

  public void setPurchaseTime(Date purchaseTime) {
    this.purchaseTime = purchaseTime;
  }


  public double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }


  public double getPurchaseSjfk() {
    return purchaseSjfk;
  }

  public void setPurchaseSjfk(double purchaseSjfk) {
    this.purchaseSjfk = purchaseSjfk;
  }


  public String getPurchaseFukuang() {
    return purchaseFukuang;
  }

  public void setPurchaseFukuang(String purchaseFukuang) {
    this.purchaseFukuang = purchaseFukuang;
  }


  public Date getPurchaseFksj() {
    return purchaseFksj;
  }

  public void setPurchaseFksj(Date purchaseFksj) {
    this.purchaseFksj = purchaseFksj;
  }


  public String getPurchaseState() {
    return purchaseState;
  }

  public void setPurchaseState(String purchaseState) {
    this.purchaseState = purchaseState;
  }


  public Date getPurchaseJhsj() {
    return purchaseJhsj;
  }

  public void setPurchaseJhsj(Date purchaseJhsj) {
    this.purchaseJhsj = purchaseJhsj;
  }

}

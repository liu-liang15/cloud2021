package com.pojos.pharmacy;


public class YpYaoFang {

  private long rkpcId;
  private long drugNumber;
  private RkXiangDan rkXiangDan;

  public long getRkpcId() {
    return rkpcId;
  }

  public void setRkpcId(long rkpcId) {
    this.rkpcId = rkpcId;
  }

  public long getDrugNumber() {
    return drugNumber;
  }

  public void setDrugNumber(long drugNumber) {
    this.drugNumber = drugNumber;
  }

  public RkXiangDan getRkXiangDan() {
    return rkXiangDan;
  }

  public void setRkXiangDan(RkXiangDan rkXiangDan) {
    this.rkXiangDan = rkXiangDan;
  }
}

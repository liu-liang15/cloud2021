package com.pojos.inpatient;


public class SurItem {

  private long surNo;
  private String surName;
  private String surType;
  private double surPay;
  private String surSco;
  private OpeRoom opeRoom;

  public OpeRoom getOpeRoom() {
    return opeRoom;
  }

  public void setOpeRoom(OpeRoom opeRoom) {
    this.opeRoom = opeRoom;
  }

  public long getSurNo() {
    return surNo;
  }

  public void setSurNo(long surNo) {
    this.surNo = surNo;
  }


  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }


  public String getSurTxt() {
    return surType;
  }

  public void setSurType(String surType) {
    this.surType = surType;
  }


  public double getSurPay() {
    return surPay;
  }

  public void setSurPay(double surPay) {
    this.surPay = surPay;
  }

  public String getsurSco() {
    return surSco;
  }

  public void setSurSco(String surSco) {
    this.surSco = surSco;
  }

}

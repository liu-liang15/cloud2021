package com.pojos.inpatient;


public class SurItem {

  private long surNo;
  private String surName;
  private String surTxt;
  private double surPay;
  private String opeNo;
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
    return surTxt;
  }

  public void setSurTxt(String surTxt) {
    this.surTxt = surTxt;
  }


  public double getSurPay() {
    return surPay;
  }

  public void setSurPay(double surPay) {
    this.surPay = surPay;
  }


  public String getOpeNo() {
    return opeNo;
  }

  public void setOpeNo(String opeNo) {
    this.opeNo = opeNo;
  }

}

package com.pojos.inpatient;


import com.pojos.system.KeShi;

public class SurItem {

  private long surNo;
  private String surName;
  private String surType;
  private double surPay;
  private String surSco;
  private KeShi ks;

  public KeShi getKs() {
    return ks;
  }

  public void setKs(KeShi ks) {
    this.ks = ks;
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


  public String getSurType() {
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

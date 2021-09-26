package com.pojos.inpatient;

public class ExpCal {

  private long expNo;
  private String resNo;
  private String medText;
  private double expPay;
  private java.sql.Timestamp expTime;
  private String expZt;


  public long getExpNo() {
    return expNo;
  }

  public void setExpNo(long expNo) {
    this.expNo = expNo;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }


  public String getMedText() {
    return medText;
  }

  public void setMedText(String medText) {
    this.medText = medText;
  }


  public double getExpPay() {
    return expPay;
  }

  public void setExpPay(double expPay) {
    this.expPay = expPay;
  }


  public java.sql.Timestamp getExpTime() {
    return expTime;
  }

  public void setExpTime(java.sql.Timestamp expTime) {
    this.expTime = expTime;
  }


  public String getExpZt() {
    return expZt;
  }

  public void setExpZt(String expZt) {
    this.expZt = expZt;
  }

  public ExpCal() {
  }

  public ExpCal(String resNo, String medText, double expPay) {
    this.resNo = resNo;
    this.medText = medText;
    this.expPay = expPay;
  }
}

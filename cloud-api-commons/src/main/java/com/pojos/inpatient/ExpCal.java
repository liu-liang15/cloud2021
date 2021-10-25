package com.pojos.inpatient;

public class ExpCal {

  private int expNo;
  private String resNo;
  private String medText;
  private double expPay;
  private java.sql.Timestamp expTime;
  private String expZt;
  private long expNum;
  private String expType;
  private String type;
  private double mon;
  private double sunMoney;

  public ExpCal(double sunMoney) {
    this.sunMoney = sunMoney;
  }

  public void setSunMoney(double sunMoney) {
    this.sunMoney = sunMoney;
  }

  public double getSunMoney() {
    return sunMoney;
  }

  public int getExpNo() {
    return expNo;
  }

  public void setExpNo(int expNo) {
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

  public long getExpNum() {
    return expNum;
  }

  public void setExpNum(long expNum) {
    this.expNum = expNum;
  }

  public String getExpType() {
    return expType;
  }

  public void setExpType(String expType) {
    this.expType = expType;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getMon() {
    return mon;
  }

  public void setMon(double mon) {
    this.mon = mon;
  }

  public ExpCal() {
  }

  public ExpCal(String resNo, String medText, double expPay, long expNum, String expType) {
    this.resNo = resNo;
    this.medText = medText;
    this.expPay = expPay;
    this.expNum = expNum;
    this.expType = expType;
  }
}

package com.pojos.inpatient;


public class HosAlone {

  private long resNo;
  private String linkman;
  private String phone;
  private String hosNo;
  private String nurse;
  private java.sql.Timestamp hosStay;
  private String payType;
  private String hosCond;
  private double hosMoney;
  private String hosZt;
  private AdmNot admNot;


  public long getResNo() {
    return resNo;
  }

  public void setResNo(long resNo) {
    this.resNo = resNo;
  }


  public String getLinkman() {
    return linkman;
  }

  public void setLinkman(String linkman) {
    this.linkman = linkman;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getHosNo() {
    return hosNo;
  }

  public void setHosNo(String hosNo) {
    this.hosNo = hosNo;
  }


  public String getNurse() {
    return nurse;
  }

  public void setNurse(String nurse) {
    this.nurse = nurse;
  }


  public java.sql.Timestamp getHosStay() {
    return hosStay;
  }

  public void setHosStay(java.sql.Timestamp hosStay) {
    this.hosStay = hosStay;
  }


  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }


  public String getHosCond() {
    return hosCond;
  }

  public void setHosCond(String hosCond) {
    this.hosCond = hosCond;
  }


  public double getHosMoney() {
    return hosMoney;
  }

  public void setHosMoney(double hosMoney) {
    this.hosMoney = hosMoney;
  }


  public String getHosZt() {
    return hosZt;
  }

  public void setHosZt(String hosZt) {
    this.hosZt = hosZt;
  }

  public AdmNot getAdmNot() {
    return admNot;
  }

  public void setAdmNot(AdmNot admNot) {
    this.admNot = admNot;
  }
}

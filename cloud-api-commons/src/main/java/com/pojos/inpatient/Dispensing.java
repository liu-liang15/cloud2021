package com.pojos.inpatient;


public class Dispensing {

  private long disId;
  private String disNur;
  private String disPer;
  private java.sql.Timestamp disFin;
  private String resNo;


  public long getDisId() {
    return disId;
  }

  public void setDisId(long disId) {
    this.disId = disId;
  }


  public String getDisNur() {
    return disNur;
  }

  public void setDisNur(String disNur) {
    this.disNur = disNur;
  }


  public String getDisPer() {
    return disPer;
  }

  public void setDisPer(String disPer) {
    this.disPer = disPer;
  }


  public java.sql.Timestamp getDisFin() {
    return disFin;
  }

  public void setDisFin(java.sql.Timestamp disFin) {
    this.disFin = disFin;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }

}

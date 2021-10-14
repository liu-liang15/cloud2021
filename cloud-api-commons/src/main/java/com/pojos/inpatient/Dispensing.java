package com.pojos.inpatient;


import com.pojos.outpatient.Patient;
import com.pojos.system.YuanGo;

public class Dispensing {

  private long disId;
  private String disNur;
  private String disPer;
  private java.sql.Timestamp disFin;
  private String resNo;
  private Patient p;
  private YuanGo yg;
  private YuanGo yg2;

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

  public Patient getP() {
    return p;
  }

  public void setP(Patient p) {
    this.p = p;
  }

  public YuanGo getYg() {
    return yg;
  }

  public void setYg(YuanGo yg) {
    this.yg = yg;
  }

  public YuanGo getYg2() {
    return yg2;
  }

  public void setYg2(YuanGo yg2) {
    this.yg2 = yg2;
  }
}

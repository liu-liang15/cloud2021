package com.pojos.inpatient;


import com.pojos.outpatient.Patient;
import com.pojos.system.YuanGo;

public class ConsApp {

  private long conNo;
  private String resNo;
  private String opeNo;
  private String surNo;
  private String conPer;
  private String conZt;
  private java.sql.Timestamp conStar;
  private String opeDoc;
  private String opeRust;
  private String conSp;
  private SurItem surItem;
  private Patient patient;
  private YuanGo yg;
  public long getConNo() {
    return conNo;
  }

  public void setConNo(long conNo) {
    this.conNo = conNo;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }


  public String getOpeNo() {
    return opeNo;
  }

  public void setOpeNo(String opeNo) {
    this.opeNo = opeNo;
  }


  public String getSurNo() {
    return surNo;
  }

  public void setSurNo(String surNo) {
    this.surNo = surNo;
  }


  public String getConPer() {
    return conPer;
  }

  public void setConPer(String conPer) {
    this.conPer = conPer;
  }


  public String getConZt() {
    return conZt;
  }

  public void setConZt(String conZt) {
    this.conZt = conZt;
  }


  public java.sql.Timestamp getConStar() {
    return conStar;
  }

  public void setConStar(java.sql.Timestamp conStar) {
    this.conStar = conStar;
  }



  public SurItem getSurItem() {
    return surItem;
  }

  public void setSurItem(SurItem surItem) {
    this.surItem = surItem;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public YuanGo getYg() {
    return yg;
  }

  public void setYg(YuanGo yg) {
    this.yg = yg;
  }

  public String getOpeDoc() {
    return opeDoc;
  }

  public void setOpeDoc(String opeDoc) {
    this.opeDoc = opeDoc;
  }

  public String getOpeRust() {
    return opeRust;
  }

  public void setOpeRust(String opeRust) {
    this.opeRust = opeRust;
  }

  public String getConSp() {
    return conSp;
  }

  public void setConSp(String conSp) {
    this.conSp = conSp;
  }

  @Override
  public String toString() {
    return "ConsApp{" +
            "conNo=" + conNo +
            ", resNo='" + resNo + '\'' +
            ", opeNo='" + opeNo + '\'' +
            ", surNo='" + surNo + '\'' +
            ", conPer='" + conPer + '\'' +
            ", conZt='" + conZt + '\'' +
            ", conStar=" + conStar +
            ", surItem=" + surItem +
            ", patient=" + patient +
            '}';
  }
}

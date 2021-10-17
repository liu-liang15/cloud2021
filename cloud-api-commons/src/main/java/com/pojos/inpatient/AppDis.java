package com.pojos.inpatient;


import com.pojos.outpatient.Medicalcard;
import com.pojos.outpatient.Patient;
import com.pojos.system.YuanGo;

public class AppDis {

  private long appDisNo;
  private String resNo;
  private String appMe;
  private String docAdv;
  private String disDoc;
  private java.sql.Timestamp outDate;
  private String outPer;
  private String appZt;
  private Patient patient;
  private YuanGo yuanGo;
  private HosAlone hosAlone;
  private Medicalcard medicalcard;

  public long getAppDisNo() {
    return appDisNo;
  }

  public void setAppDisNo(long appDisNo) {
    this.appDisNo = appDisNo;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }


  public String getAppMe() {
    return appMe;
  }

  public void setAppMe(String appMe) {
    this.appMe = appMe;
  }


  public String getDocAdv() {
    return docAdv;
  }

  public void setDocAdv(String docAdv) {
    this.docAdv = docAdv;
  }


  public String getDisDoc() {
    return disDoc;
  }

  public void setDisDoc(String disDoc) {
    this.disDoc = disDoc;
  }


  public java.sql.Timestamp getOutDate() {
    return outDate;
  }

  public void setOutDate(java.sql.Timestamp outDate) {
    this.outDate = outDate;
  }


  public String getOutPer() {
    return outPer;
  }

  public void setOutPer(String outPer) {
    this.outPer = outPer;
  }


  public String getAppZt() {
    return appZt;
  }

  public void setAppZt(String appZt) {
    this.appZt = appZt;
  }

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public YuanGo getYuanGo() {
    return yuanGo;
  }

  public void setYuanGo(YuanGo yuanGo) {
    this.yuanGo = yuanGo;
  }

  public HosAlone getHosAlone() {
    return hosAlone;
  }

  public void setHosAlone(HosAlone hosAlone) {
    this.hosAlone = hosAlone;
  }

  public Medicalcard getMedicalcard() {
    return medicalcard;
  }

  public void setMedicalcard(Medicalcard medicalcard) {
    this.medicalcard = medicalcard;
  }

}

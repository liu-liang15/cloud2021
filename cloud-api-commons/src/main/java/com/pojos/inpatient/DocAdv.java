package com.pojos.inpatient;


import com.pojos.system.YuanGo;

import java.sql.Timestamp;

public class DocAdv {

  private long docAdvNo;
  private String resNo;
  private String docPer;
  private java.sql.Timestamp docAdtime;
  private String docType;
  private String docTxt;
  private java.sql.Timestamp docEnd;
  private YuanGo yuanGo;
  public long getDocAdvNo() {
    return docAdvNo;
  }

  public void setDocAdvNo(long docAdvNo) {
    this.docAdvNo = docAdvNo;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }


  public String getDocPer() {
    return docPer;
  }

  public void setDocPer(String docPer) {
    this.docPer = docPer;
  }


  public java.sql.Timestamp getDocAdtime() {
    return docAdtime;
  }

  public void setDocAdtime(java.sql.Timestamp docAdtime) {
    this.docAdtime = docAdtime;
  }


  public String getDocType() {
    return docType;
  }

  public void setDocType(String docType) {
    this.docType = docType;
  }

  public String getDocTxt() {
    return docTxt;
  }

  public void setDocTxt(String docTxt) {
    this.docTxt = docTxt;
  }

  public Timestamp getDocEnd() {
    return docEnd;
  }

  public void setDocEnd(Timestamp docEnd) {
    this.docEnd = docEnd;
  }

  public YuanGo getYuanGo() {
    return yuanGo;
  }

  public void setYuanGo(YuanGo yuanGo) {
    this.yuanGo = yuanGo;
  }
}

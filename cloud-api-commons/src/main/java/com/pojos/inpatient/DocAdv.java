package com.pojos.inpatient;


public class DocAdv {

  private long docAdvNo;
  private String resNo;
  private String docPer;
  private java.sql.Timestamp docAdtime;
  private String docType;
  private String docTxt;


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
}

package com.pojos.inpatient;


import com.pojos.pharmacy.YaoPingXx;

public class DocExe {

  private long docExeNo;
  private String docAdvId;
  private java.sql.Timestamp docTime;
  private String docNur;
  private YaoPingXx yaoPingXx;
  private DocAdvXq docAdvXq;

  public long getDocExeNo() {
    return docExeNo;
  }

  public void setDocExeNo(long docExeNo) {
    this.docExeNo = docExeNo;
  }


  public String getDocAdvId() {
    return docAdvId;
  }

  public void setDocAdvId(String docAdvId) {
    this.docAdvId = docAdvId;
  }


  public java.sql.Timestamp getDocTime() {
    return docTime;
  }

  public void setDocTime(java.sql.Timestamp docTime) {
    this.docTime = docTime;
  }


  public String getDocNur() {
    return docNur;
  }

  public void setDocNur(String docNur) {
    this.docNur = docNur;
  }

  public YaoPingXx getYaoPingXx() {
    return yaoPingXx;
  }

  public void setYaoPingXx(YaoPingXx yaoPingXx) {
    this.yaoPingXx = yaoPingXx;
  }

  public DocAdvXq getDocAdvXq() {
    return docAdvXq;
  }

  public void setDocAdvXq(DocAdvXq docAdvXq) {
    this.docAdvXq = docAdvXq;
  }
}

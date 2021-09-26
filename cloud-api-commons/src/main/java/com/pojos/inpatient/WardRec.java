package com.pojos.inpatient;


public class WardRec {

  private long wardRecNo;
  private String wardNo;
  private java.sql.Timestamp wardTime;
  private String recType;
  private String recReson;
  private Ward ward;

  public Ward getWard() {
    return ward;
  }

  public void setWard(Ward ward) {
    this.ward = ward;
  }

  public long getWardRecNo() {
    return wardRecNo;
  }

  public void setWardRecNo(long wardRecNo) {
    this.wardRecNo = wardRecNo;
  }


  public String getWardNo() {
    return wardNo;
  }

  public void setWardNo(String wardNo) {
    this.wardNo = wardNo;
  }


  public java.sql.Timestamp getWardTime() {
    return wardTime;
  }

  public void setWardTime(java.sql.Timestamp wardTime) {
    this.wardTime = wardTime;
  }


  public String getRecType() {
    return recType;
  }

  public void setRecType(String recType) {
    this.recType = recType;
  }


  public String getRecReson() {
    return recReson;
  }

  public void setRecReson(String recReson) {
    this.recReson = recReson;
  }

}

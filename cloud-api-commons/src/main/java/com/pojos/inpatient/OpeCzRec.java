package com.pojos.inpatient;


public class OpeCzRec {

  private long opeCzNo;
  private java.sql.Timestamp opeCzTime;
  private long opeNo;
  private String opeCzType;
  private String opeCzRes;
  private OpeRoom opeRoom;

  public OpeRoom getOpeRoom() {
    return opeRoom;
  }

  public void setOpeRoom(OpeRoom opeRoom) {
    this.opeRoom = opeRoom;
  }

  public long getOpeCzNo() {
    return opeCzNo;
  }

  public void setOpeCzNo(long opeCzNo) {
    this.opeCzNo = opeCzNo;
  }


  public java.sql.Timestamp getOpeCzTime() {
    return opeCzTime;
  }

  public void setOpeCzTime(java.sql.Timestamp opeCzTime) {
    this.opeCzTime = opeCzTime;
  }


  public long getOpeNo() {
    return opeNo;
  }

  public void setOpeNo(long opeNo) {
    this.opeNo = opeNo;
  }


  public String getOpeCzType() {
    return opeCzType;
  }

  public void setOpeCzType(String opeCzType) {
    this.opeCzType = opeCzType;
  }


  public String getOpeCzRes() {
    return opeCzRes;
  }

  public void setOpeCzRes(String opeCzRes) {
    this.opeCzRes = opeCzRes;
  }

  @Override
  public String toString() {
    return "OpeCzRec{" +
            "opeCzNo=" + opeCzNo +
            ", opeCzTime=" + opeCzTime +
            ", opeNo=" + opeNo +
            ", opeCzType='" + opeCzType + '\'' +
            ", opeCzRes='" + opeCzRes + '\'' +
            '}';
  }
}

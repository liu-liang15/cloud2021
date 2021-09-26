package com.pojos.inpatient;


public class BedRec {

  private long bedRecNo;
  private String bedNo;
  private java.sql.Timestamp bedTime;
  private String resNo;
  private Bed bed;
  private Ward ward;
  private HosAlone hosAlone;

  public Bed getBed() {
    return bed;
  }

  public void setBed(Bed bed) {
    this.bed = bed;
  }

  public Ward getWard() {
    return ward;
  }

  public void setWard(Ward ward) {
    this.ward = ward;
  }

  public HosAlone getHosAlone() {
    return hosAlone;
  }

  public void setHosAlone(HosAlone hosAlone) {
    this.hosAlone = hosAlone;
  }

  public long getBedRecNo() {
    return bedRecNo;
  }

  public void setBedRecNo(long bedRecNo) {
    this.bedRecNo = bedRecNo;
  }


  public String getBedNo() {
    return bedNo;
  }

  public void setBedNo(String bedNo) {
    this.bedNo = bedNo;
  }


  public java.sql.Timestamp getBedTime() {
    return bedTime;
  }

  public void setBedTime(java.sql.Timestamp bedTime) {
    this.bedTime = bedTime;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }

}

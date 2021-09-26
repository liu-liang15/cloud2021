package com.pojos.inpatient;

public class BedCzRec {

  private long bedCzRec;
  private java.sql.Timestamp bedCzTime;
  private String bedCzType;
  private String bedNo;
  private String bedCzReson;
  private Bed bed;
  private Ward ward;

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

  public long getBedCzRec() {
    return bedCzRec;
  }

  public void setBedCzRec(long bedCzRec) {
    this.bedCzRec = bedCzRec;
  }


  public java.sql.Timestamp getBedCzTime() {
    return bedCzTime;
  }

  public void setBedCzTime(java.sql.Timestamp bedCzTime) {
    this.bedCzTime = bedCzTime;
  }


  public String getBedCzType() {
    return bedCzType;
  }

  public void setBedCzType(String bedCzType) {
    this.bedCzType = bedCzType;
  }


  public String getBedNo() {
    return bedNo;
  }

  public void setBedNo(String bedNo) {
    this.bedNo = bedNo;
  }


  public String getBedCzReson() {
    return bedCzReson;
  }

  public void setBedCzReson(String bedCzReson) {
    this.bedCzReson = bedCzReson;
  }

}

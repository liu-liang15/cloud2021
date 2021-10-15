package com.pojos.inpatient;


import com.pojos.system.KeShi;

public class Ward {

  private long wardNo;
  private String wardName;
  private String wardDress;
  private String wardZt;
  private double wardMon;
  private String ksId;
  private KeShi ks;


  public long getWardNo() {
    return wardNo;
  }

  public void setWardNo(long wardNo) {
    this.wardNo = wardNo;
  }


  public String getWardName() {
    return wardName;
  }

  public void setWardName(String wardName) {
    this.wardName = wardName;
  }


  public String getWardDress() {
    return wardDress;
  }

  public void setWardDress(String wardDress) {
    this.wardDress = wardDress;
  }


  public String getWardZt() {
    return wardZt;
  }

  public void setWardZt(String wardZt) {
    this.wardZt = wardZt;
  }


  public double getWardMon() {
    return wardMon;
  }

  public void setWardMon(double wardMon) {
    this.wardMon = wardMon;
  }


  public String getKsId() {
    return ksId;
  }

  public void setKsId(String ksId) {
    this.ksId = ksId;
  }

  public KeShi getKs() {
    return ks;
  }

  public void setKs(KeShi ks) {
    this.ks = ks;
  }
}

package com.pojos.inpatient;


import com.pojos.system.KeShi;

public class OpeRoom {

  private long opeNo;
  private String opeName;
  private String opeDress;
  private String opeKs;
  private String opeZt;
  private KeShi ks;

  public long getOpeNo() {
    return opeNo;
  }

  public void setOpeNo(long opeNo) {
    this.opeNo = opeNo;
  }


  public String getOpeName() {
    return opeName;
  }

  public void setOpeName(String opeName) {
    this.opeName = opeName;
  }


  public String getOpeDress() {
    return opeDress;
  }

  public void setOpeDress(String opeDress) {
    this.opeDress = opeDress;
  }


  public String getOpeKs() {
    return opeKs;
  }

  public void setOpeKs(String opeKs) {
    this.opeKs = opeKs;
  }


  public String getOpeZt() {
    return opeZt;
  }

  public void setOpeZt(String opeZt) {
    this.opeZt = opeZt;
  }

  public KeShi getKs() {
    return ks;
  }

  public void setKs(KeShi ks) {
    this.ks = ks;
  }
}

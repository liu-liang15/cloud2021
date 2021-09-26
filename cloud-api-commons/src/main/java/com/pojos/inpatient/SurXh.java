package com.pojos.inpatient;


import com.pojos.pharmacy.HaoCai;

public class SurXh {

  private long surXhNo;
  private long surNo;
  private long consuId;
  private long hxNumber;
  private HaoCai haoCai;

  public long getSurXhNo() {
    return surXhNo;
  }

  public void setSurXhNo(long surXhNo) {
    this.surXhNo = surXhNo;
  }


  public long getSurNo() {
    return surNo;
  }

  public void setSurNo(long surNo) {
    this.surNo = surNo;
  }


  public long getConsuId() {
    return consuId;
  }

  public void setConsuId(long consuId) {
    this.consuId = consuId;
  }


  public long getHxNumber() {
    return hxNumber;
  }

  public void setHxNumber(long hxNumber) {
    this.hxNumber = hxNumber;
  }

  public HaoCai getHaoCai() {
    return haoCai;
  }

  public void setHaoCai(HaoCai haoCai) {
    this.haoCai = haoCai;
  }

  @Override
  public String toString() {
    return "SurXh{" +
            "surXhNo=" + surXhNo +
            ", surNo=" + surNo +
            ", consuId=" + consuId +
            ", hxNumber=" + hxNumber +
            '}';
  }
}

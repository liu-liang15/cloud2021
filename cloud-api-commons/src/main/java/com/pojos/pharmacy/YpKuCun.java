package com.pojos.pharmacy;


public class YpKuCun {

  private long kcId;
  private String rkpcId;
  private long ypsl;
  private RkXiangDan rkXiangDan;

  public RkXiangDan getRkXiangDan() {
    return rkXiangDan;
  }

  public void setRkXiangDan(RkXiangDan rkXiangDan) {
    this.rkXiangDan = rkXiangDan;
  }

  public long getKcId() {
    return kcId;
  }

  public void setKcId(long kcId) {
    this.kcId = kcId;
  }


  public String getRkpcId() {
    return rkpcId;
  }

  public void setRkpcId(String rkpcId) {
    this.rkpcId = rkpcId;
  }


  public long getYpsl() {
    return ypsl;
  }

  public void setYpsl(long ypsl) {
    this.ypsl = ypsl;
  }

}

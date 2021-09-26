package com.pojos.pharmacy;


import java.util.Collection;
import java.util.Date;

public class RuKu {

  private String rhDh;
  private String rhShr;
  private Date rhSj = new Date();
  private String rhYuanYing;
  private String rhd;

  private String purchaseSjfk;
  private Collection<RkXiangDan> rkXiangDans;

  public Collection<RkXiangDan> getRkXiangDans() {
    return rkXiangDans;
  }

  public String getPurchaseSjfk() {
    return purchaseSjfk;
  }

  public void setPurchaseSjfk(String purchaseSjfk) {
    this.purchaseSjfk = purchaseSjfk;
  }

  public void setRkXiangDans(Collection<RkXiangDan> rkXiangDans) {
    this.rkXiangDans = rkXiangDans;
  }

  public String getRhDh() {
    return rhDh;
  }

  public void setRhDh(String rhDh) {
    this.rhDh = rhDh;
  }


  public String getRhShr() {
    return rhShr;
  }

  public void setRhShr(String rhShr) {
    this.rhShr = rhShr;
  }


  public Date getRhSj() {
    return rhSj;
  }

  public void setRhSj(Date rhSj) {
    this.rhSj = rhSj;
  }


  public String getRhYuanYing() {
    return rhYuanYing;
  }

  public void setRhYuanYing(String rhYuanYing) {
    this.rhYuanYing = rhYuanYing;
  }


  public String getRhd() {
    return rhd;
  }

  public void setRhd(String rhd) {
    this.rhd = rhd;
  }

}

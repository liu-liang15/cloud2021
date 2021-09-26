package com.pojos.pharmacy;


import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ChuKu {

  private String chukuId;
  private String chukuFuzhe;
  private String chukuCause;
  private Date chukuTime=new Date();
  private Collection<ChuKuJiLu> chuKuJiLus;
  private List<Interim> interims;
  private int zt;
  private String xhsqId;

  public List<Interim> getInterims() {
    return interims;
  }

  public void setInterims(List<Interim> interims) {
    this.interims = interims;
  }

  public String getChukuId() {
    return chukuId;
  }

  public void setChukuId(String chukuId) {
    this.chukuId = chukuId;
  }

  public String getChukuFuzhe() {
    return chukuFuzhe;
  }

  public void setChukuFuzhe(String chukuFuzhe) {
    this.chukuFuzhe = chukuFuzhe;
  }

  public String getChukuCause() {
    return chukuCause;
  }

  public void setChukuCause(String chukuCause) {
    this.chukuCause = chukuCause;
  }

  public Date getChukuTime() {
    return chukuTime;
  }

  public void setChukuTime(Date chukuTime) {
    this.chukuTime = chukuTime;
  }

  public Collection<ChuKuJiLu> getChuKuJiLus() {
    return chuKuJiLus;
  }

  public void setChuKuJiLus(Collection<ChuKuJiLu> chuKuJiLus) {
    this.chuKuJiLus = chuKuJiLus;
  }

  public int getZt() {
    return zt;
  }

  public void setZt(int zt) {
    this.zt = zt;
  }

  public String getXhsqId() {
    return xhsqId;
  }

  public void setXhsqId(String xhsqId) {
    this.xhsqId = xhsqId;
  }
}

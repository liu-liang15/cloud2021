package com.pojos.pharmacy;


import java.util.Collection;
import java.util.Date;

public class PanDian {
  private String pdId;
  private Date pdSj=new Date();
  private String pdCk;
  private String pdFzr;
  private String pdBz;
  private Collection<PangDainXd> pangDainXds;

  public Collection<PangDainXd> getPangDainXds() {
    return pangDainXds;
  }

  public void setPangDainXds(Collection<PangDainXd> pangDainXds) {
    this.pangDainXds = pangDainXds;
  }

  public String getPdId() {
    return pdId;
  }

  public void setPdId(String pdId) {
    this.pdId = pdId;
  }

  public Date getPdSj() {
    return pdSj;
  }

  public void setPdSj(Date pdSj) {
    this.pdSj = pdSj;
  }

  public String getPdCk() {
    return pdCk;
  }

  public void setPdCk(String pdCk) {
    this.pdCk = pdCk;
  }


  public String getPdFzr() {
    return pdFzr;
  }

  public void setPdFzr(String pdFzr) {
    this.pdFzr = pdFzr;
  }


  public String getPdBz() {
    return pdBz;
  }

  public void setPdBz(String pdBz) {
    this.pdBz = pdBz;
  }

}

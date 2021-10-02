package com.pojos.pharmacy;


import java.util.Collection;
import java.util.Date;

public class FaYao {

  private String fyId;
  private String fyRy;
  private String jfd;
  private Date fySj=new Date();
  private Collection<FaoYaoXd> faoYaoXds;

  public Collection<FaoYaoXd> getFaoYaoXds() {
    return faoYaoXds;
  }

  public void setFaoYaoXds(Collection<FaoYaoXd> faoYaoXds) {
    this.faoYaoXds = faoYaoXds;
  }

  public String getFyId() {
    return fyId;
  }

  public void setFyId(String fyId) {
    this.fyId = fyId;
  }

  public String getFyRy() {
    return fyRy;
  }

  public void setFyRy(String fyRy) {
    this.fyRy = fyRy;
  }

  public String getJfd() {
    return jfd;
  }

  public void setJfd(String jfd) {
    this.jfd = jfd;
  }

  public Date getFySj() {
    return fySj;
  }

  public void setFySj(Date fySj) {
    this.fySj = fySj;
  }
}

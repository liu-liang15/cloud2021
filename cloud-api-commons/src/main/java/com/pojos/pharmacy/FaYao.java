package com.pojos.pharmacy;


import com.pojos.system.YuanGo;

import java.util.Collection;
import java.util.Date;

public class FaYao {

  private String fyId;
  private String fyRy;
  private String fyYy;
  private String jfd;
  private Date fySj=new Date();
  private YuanGo yuanGo;
  private Collection<FaoYaoXd> faoYaoXds;

  public YuanGo getYuanGo() {
    return yuanGo;
  }

  public void setYuanGo(YuanGo yuanGo) {
    this.yuanGo = yuanGo;
  }

  public String getFyYy() {
    return fyYy;
  }

  public void setFyYy(String fyYy) {
    this.fyYy = fyYy;
  }

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

package com.pojos.pharmacy;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RkXiangDan {
  private long rkPc;
  private String rkDh;
  private String drugId;
  private String consuId;
  private int rkypSl;
  @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
  private Date scrq;
  @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
  private Date bzq;
  private String ckId;
  private int riqi;
  private YaoPingXx yaoPingXx;
  private HaoCai haoCai;
  private YaoKu yaoKu;

  public int getRiqi() {
    return riqi;
  }

  public void setRiqi(int riqi) {
    this.riqi = riqi;
  }

  public YaoKu getYaoKu() {
    return yaoKu;
  }

  public void setYaoKu(YaoKu yaoKu) {
    this.yaoKu = yaoKu;
  }

  public HaoCai getHaoCai() {
    return haoCai;
  }

  public void setHaoCai(HaoCai haoCai) {
    this.haoCai = haoCai;
  }

  public YaoPingXx getYaoPingXx() {
    return yaoPingXx;
  }

  public void setYaoPingXx(YaoPingXx yaoPingXx) {
    this.yaoPingXx = yaoPingXx;
  }

  public String getConsuId() {
    return consuId;
  }

  public void setConsuId(String consuId) {
    this.consuId = consuId;
  }

  public String getRkDh() {
    return rkDh;
  }

  public void setRkDh(String rkDh) {
    this.rkDh = rkDh;
  }

  public String getDrugId() {
    return drugId;
  }

  public void setDrugId(String drugId) {
    this.drugId = drugId;
  }

  public long getRkPc() {
    return rkPc;
  }

  public void setRkPc(long rkPc) {
    this.rkPc = rkPc;
  }



  public int getRkypSl() {
    return rkypSl;
  }

  public void setRkypSl(int rkypSl) {
    this.rkypSl = rkypSl;
  }


  public Date getScrq() {
    return scrq;
  }

  public void setScrq(Date scrq) {
    this.scrq = scrq;
  }


  public Date getBzq() {
    return bzq;
  }

  public void setBzq(Date bzq) {
    this.bzq = bzq;
  }


  public String getCkId() {
    return ckId;
  }

  public void setCkId(String ckId) {
    this.ckId = ckId;
  }

}

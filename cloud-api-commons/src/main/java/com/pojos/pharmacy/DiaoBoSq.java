package com.pojos.pharmacy;



import com.pojos.system.YongHu;

import java.util.Collection;
import java.util.Date;

public class DiaoBoSq {

  private String dbShengQing;
  private String dbfzr;
  private Date sqsj = new Date();
  private String sqZhuangTai;
  private Collection<DbsqXiangBiao> dbsqXiangBiaos;
  private YongHu yongHu;

  public YongHu getYongHu() {
    return yongHu;
  }

  public void setYongHu(YongHu yongHu) {
    this.yongHu = yongHu;
  }

  public Collection<DbsqXiangBiao> getDbsqXiangBiaos() {
    return dbsqXiangBiaos;
  }

  public void setDbsqXiangBiaos(Collection<DbsqXiangBiao> dbsqXiangBiaos) {
    this.dbsqXiangBiaos = dbsqXiangBiaos;
  }

  public String getDbShengQing() {
    return dbShengQing;
  }

  public void setDbShengQing(String dbShengQing) {
    this.dbShengQing = dbShengQing;
  }


  public String getDbfzr() {
    return dbfzr;
  }

  public void setDbfzr(String dbfzr) {
    this.dbfzr = dbfzr;
  }


  public Date getSqsj() {
    return sqsj;
  }

  public void setSqsj(Date sqsj) {
    this.sqsj = sqsj;
  }


  public String getSqZhuangTai() {
    return sqZhuangTai;
  }

  public void setSqZhuangTai(String sqZhuangTai) {
    this.sqZhuangTai = sqZhuangTai;
  }

}

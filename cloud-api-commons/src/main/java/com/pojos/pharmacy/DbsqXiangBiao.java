package com.pojos.pharmacy;


public class DbsqXiangBiao {

  private long dbsqxdId;
  private String dbsqId;
  private String ypBh;
  private int dbSl;
  private YaoPingXx yaoPingXx;

  public YaoPingXx getYaoPingXx() {
    return yaoPingXx;
  }

  public void setYaoPingXx(YaoPingXx yaoPingXx) {
    this.yaoPingXx = yaoPingXx;
  }

  public long getDbsqxdId() {
    return dbsqxdId;
  }

  public void setDbsqxdId(long dbsqxdId) {
    this.dbsqxdId = dbsqxdId;
  }


  public String getDbsqId() {
    return dbsqId;
  }

  public void setDbsqId(String dbsqId) {
    this.dbsqId = dbsqId;
  }


  public String getYpBh() {
    return ypBh;
  }

  public void setYpBh(String ypBh) {
    this.ypBh = ypBh;
  }


  public int getDbSl() {
    return dbSl;
  }

  public void setDbSl(int dbSl) {
    this.dbSl = dbSl;
  }

}

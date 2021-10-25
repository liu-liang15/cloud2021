package com.pojos.pharmacy;


public class XiaoHuiXd {

  private long xhsqxdId;
  private String xhsqId;
  private String rkpcId;
  private long ypsl;

  public XiaoHuiXd(String rkpcId, long ypsl) {
    this.rkpcId = rkpcId;
    this.ypsl = ypsl;
  }

  public XiaoHuiXd() {
  }

  private RkXiangDan rkXiangDan;

  public RkXiangDan getRkXiangDan() {
    return rkXiangDan;
  }

  public void setRkXiangDan(RkXiangDan rkXiangDan) {
    this.rkXiangDan = rkXiangDan;
  }

  public long getXhsqxdId() {
    return xhsqxdId;
  }

  public void setXhsqxdId(long xhsqxdId) {
    this.xhsqxdId = xhsqxdId;
  }


  public String getXhsqId() {
    return xhsqId;
  }

  public void setXhsqId(String xhsqId) {
    this.xhsqId = xhsqId;
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

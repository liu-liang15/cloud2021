package com.pojos.pharmacy;



import com.pojos.system.YongHu;

import java.util.Collection;
import java.util.Date;

public class XiaoHuiSq {

  private String xhsqId;
  private String xhFzr;
  private Date sj=new Date();
  private long zt;
  private String yy;
  private Collection<XiaoHuiXd> xiaoHuiXds;
  private YongHu yongHu;

  public String getYy() {
    return yy;
  }

  public void setYy(String yy) {
    this.yy = yy;
  }

  public YongHu getYongHu() {
    return yongHu;
  }

  public void setYongHu(YongHu yongHu) {
    this.yongHu = yongHu;
  }

  public Collection<XiaoHuiXd> getXiaoHuiXds() {
    return xiaoHuiXds;
  }

  public void setXiaoHuiXds(Collection<XiaoHuiXd> xiaoHuiXds) {
    this.xiaoHuiXds = xiaoHuiXds;
  }

  public String getXhsqId() {
    return xhsqId;
  }

  public void setXhsqId(String xhsqId) {
    this.xhsqId = xhsqId;
  }


  public String getXhFzr() {
    return xhFzr;
  }

  public void setXhFzr(String xhFzr) {
    this.xhFzr = xhFzr;
  }


  public Date getSj() {
    return sj;
  }

  public void setSj(Date sj) {
    this.sj = sj;
  }


  public long getZt() {
    return zt;
  }

  public void setZt(long zt) {
    this.zt = zt;
  }

}

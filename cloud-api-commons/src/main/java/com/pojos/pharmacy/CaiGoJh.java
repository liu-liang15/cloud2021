package com.pojos.pharmacy;



import com.pojos.system.YongHu;

import java.util.Collection;
import java.util.Date;

public class CaiGoJh {
  private String planId;
  private String supplyId;
  private String userId;
  //返回前端注解
  private Date planTime = new Date();
  //返回前端注解
  private Date planXiugai  = new Date();
  private double planPrice;
  private GoYingShang goYingShangs ;
  private YongHu yongHu;
  private Collection<JhXiangDan> jhXiangDans;

  public YongHu getYongHu() {
    return yongHu;
  }

  public void setYongHu(YongHu yongHu) {
    this.yongHu = yongHu;
  }

  public GoYingShang getGoYingShangs() {
    return goYingShangs;
  }

  public void setGoYingShangs(GoYingShang goYingShangs) {
    this.goYingShangs = goYingShangs;
  }

  public Collection<JhXiangDan> getJhXiangDans() {
    return jhXiangDans;
  }

  public void setJhXiangDans(Collection<JhXiangDan> jhXiangDans) {
    this.jhXiangDans = jhXiangDans;
  }

  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public String getSupplyId() {
    return supplyId;
  }

  public void setSupplyId(String supplyId) {
    this.supplyId = supplyId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public Date getPlanTime() {
    return planTime;
  }

  public void setPlanTime(Date planTime) {
    this.planTime = planTime;
  }


  public Date getPlanXiugai() {
    return planXiugai;
  }

  public void setPlanXiugai(Date planXiugai) {
    this.planXiugai = planXiugai;
  }


  public double getPlanPrice() {
    return planPrice;
  }

  public void setPlanPrice(double planPrice) {
    this.planPrice = planPrice;
  }

  @Override
  public String toString() {
    return "CaiGoJh{" +
            "planId=" + planId +
            ", supplyId='" + supplyId + '\'' +
            ", userId='" + userId + '\'' +
            ", planTime=" + planTime +
            ", planXiugai=" + planXiugai +
            ", planPrice=" + planPrice +
            '}';
  }
}

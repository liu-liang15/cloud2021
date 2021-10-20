package com.pojos.pharmacy;



import com.pojos.system.YongHu;
import com.pojos.system.YuanGo;

import java.util.Collection;
import java.util.Date;

public class CaiGoJh {
  private String planId;
  private String supplyId;
  private String userId;
  private Date planTime = new Date();
  private double planPrice;
  private GoYingShang goYingShangs ;
  private YuanGo yuanGo;
  private Collection<JhXiangDan> jhXiangDans;

  public YuanGo getYuanGo() {
    return yuanGo;
  }

  public void setYuanGo(YuanGo yuanGo) {
    this.yuanGo = yuanGo;
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
            ", planPrice=" + planPrice +
            '}';
  }
}

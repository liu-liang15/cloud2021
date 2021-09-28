package com.pojos.outpatient;

import com.pojos.pharmacy.YaoPingXx;
import lombok.Data;

import java.util.Date;

@Data
public class FeebillDetails {

  private int febideNo;
  private int febideFeebillNo;
  private int febideId;
  private String febideName;
  private Double febideMoney;
  private String febideType;
  private int febideCount;
  private String febideState;
  private YaoPingXx yaoPingXx;

  public YaoPingXx getYaoPingXx() {
    return yaoPingXx;
  }

  public void setYaoPingXx(YaoPingXx yaoPingXx) {
    this.yaoPingXx = yaoPingXx;
  }

  public FeebillDetails(int febideNo, int febideFeebillNo, int febideId, String febideName, Double febideMoney, String febideType, int febideCount) {
    this.febideNo = febideNo;
    this.febideFeebillNo = febideFeebillNo;
    this.febideId = febideId;
    this.febideName = febideName;
    this.febideMoney = febideMoney;
    this.febideType = febideType;
    this.febideCount = febideCount;
  }

  public FeebillDetails(int febideNo, int febideFeebillNo, int febideId, String febideName, Double febideMoney, String febideType, int febideCount, String febideState) {
    this.febideNo = febideNo;
    this.febideFeebillNo = febideFeebillNo;
    this.febideId = febideId;
    this.febideName = febideName;
    this.febideMoney = febideMoney;
    this.febideType = febideType;
    this.febideCount = febideCount;
    this.febideState = febideState;
  }

  public int getFebideNo() {
    return febideNo;
  }

  public void setFebideNo(int febideNo) {
    this.febideNo = febideNo;
  }

  public int getFebideFeebillNo() {
    return febideFeebillNo;
  }

  public void setFebideFeebillNo(int febideFeebillNo) {
    this.febideFeebillNo = febideFeebillNo;
  }

  public int getFebideId() {
    return febideId;
  }

  public void setFebideId(int febideId) {
    this.febideId = febideId;
  }

  public String getFebideName() {
    return febideName;
  }

  public void setFebideName(String febideName) {
    this.febideName = febideName;
  }

  public Double getFebideMoney() {
    return febideMoney;
  }

  public void setFebideMoney(Double febideMoney) {
    this.febideMoney = febideMoney;
  }

  public String getFebideType() {
    return febideType;
  }

  public void setFebideType(String febideType) {
    this.febideType = febideType;
  }

  public int getFebideCount() {
    return febideCount;
  }

  public void setFebideCount(int febideCount) {
    this.febideCount = febideCount;
  }

  public String getFebideState() {
    return febideState;
  }

  public void setFebideState(String febideState) {
    this.febideState = febideState;
  }

  public FeebillDetails(){}

}


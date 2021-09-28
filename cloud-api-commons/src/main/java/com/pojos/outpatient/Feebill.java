package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Feebill {

  private int feebillNo;
  private String feebillSeedoNumber;
  private Double feebillMoney;
  private String feebillType;
  private java.util.Date feebillDate;
  private int feebillState;
  private String feebillRemark;
  private List<FeebillDetails> feebillDetails;

  public int getFeebillNo() {
    return feebillNo;
  }

  public void setFeebillNo(int feebillNo) {
    this.feebillNo = feebillNo;
  }

  public String getFeebillSeedoNumber() {
    return feebillSeedoNumber;
  }

  public void setFeebillSeedoNumber(String feebillSeedoNumber) {
    this.feebillSeedoNumber = feebillSeedoNumber;
  }

  public Double getFeebillMoney() {
    return feebillMoney;
  }

  public void setFeebillMoney(Double feebillMoney) {
    this.feebillMoney = feebillMoney;
  }

  public String getFeebillType() {
    return feebillType;
  }

  public void setFeebillType(String feebillType) {
    this.feebillType = feebillType;
  }

  public Date getFeebillDate() {
    return feebillDate;
  }

  public void setFeebillDate(Date feebillDate) {
    this.feebillDate = feebillDate;
  }

  public int getFeebillState() {
    return feebillState;
  }

  public void setFeebillState(int feebillState) {
    this.feebillState = feebillState;
  }

  public String getFeebillRemark() {
    return feebillRemark;
  }

  public void setFeebillRemark(String feebillRemark) {
    this.feebillRemark = feebillRemark;
  }

  public List<FeebillDetails> getFeebillDetails() {
    return feebillDetails;
  }

  public void setFeebillDetails(List<FeebillDetails> feebillDetails) {
    this.feebillDetails = feebillDetails;
  }

  public Feebill(){}

  public Feebill(int feebillNo, String feebillSeedoNumber, Double feebillMoney, String feebillType, Date feebillDate, int feebillState, String feebillRemark) {
    this.feebillNo = feebillNo;
    this.feebillSeedoNumber = feebillSeedoNumber;
    this.feebillMoney = feebillMoney;
    this.feebillType = feebillType;
    this.feebillDate = feebillDate;
    this.feebillState = feebillState;
    this.feebillRemark = feebillRemark;
  }
}


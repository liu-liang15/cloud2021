package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Prescription {

  private int presNo;
  private int presSeedocNo;
  private String presSeedoNumber;
  private String presFamiroomNo;
  private String presDocNo;
  private double presMoney;
  private Date presDate;
  private String presState;

  public Prescription(){}

  public Prescription(int presNo, int presSeedocNo, String presSeedoNumber, String presFamiroomNo, String presDocNo, double presMoney, Date presDate, String presState) {
    this.presNo = presNo;
    this.presSeedocNo = presSeedocNo;
    this.presSeedoNumber = presSeedoNumber;
    this.presFamiroomNo = presFamiroomNo;
    this.presDocNo = presDocNo;
    this.presMoney = presMoney;
    this.presDate = presDate;
    this.presState = presState;
  }
}


package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Assay {

  private int assayNo;
  private String assaySeedoNumber;
  private double assayMoney;
  private Date assayDate;
  private int assayState;

  public Assay(){}

  public Assay(int assayNo, String assaySeedoNumber, double assayMoney, Date assayDate, int assayState) {
    this.assayNo = assayNo;
    this.assaySeedoNumber = assaySeedoNumber;
    this.assayMoney = assayMoney;
    this.assayDate = assayDate;
    this.assayState = assayState;
  }
}


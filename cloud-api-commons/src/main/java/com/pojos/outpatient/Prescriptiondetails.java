package com.pojos.outpatient;

import lombok.Data;

@Data
public class Prescriptiondetails {

  private int predetNo;
  private String predetPresNo;
  private String drugId;
  private String drugName;
  private String number;
  private double drugShoujia;
  private double xiaoji;
  private String usage;
  private String pinci;
  private String zu;
  private int state;

  public Prescriptiondetails(){}

  public Prescriptiondetails(int predetNo, String predetPresNo, String drugId, String drugName, String number, double drugShoujia, double xiaoji, String usage, String pinci, String zu, int state) {
    this.predetNo = predetNo;
    this.predetPresNo = predetPresNo;
    this.drugId = drugId;
    this.drugName = drugName;
    this.number = number;
    this.drugShoujia = drugShoujia;
    this.xiaoji = xiaoji;
    this.usage = usage;
    this.pinci = pinci;
    this.zu = zu;
    this.state = state;
  }
}


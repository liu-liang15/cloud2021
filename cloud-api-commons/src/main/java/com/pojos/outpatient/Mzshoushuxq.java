package com.pojos.outpatient;

import lombok.Data;

@Data
public class Mzshoushuxq {

  private int sqNo;
  private int surNo;
  private int sqSsNo;
  private double surPay;
  private int sqCount;
  private int sqState;

  public Mzshoushuxq(){}

  public Mzshoushuxq(int sqNo, int surNo, int sqSsNo, double surPay, int sqCount, int sqState) {
    this.sqNo = sqNo;
    this.surNo = surNo;
    this.sqSsNo = sqSsNo;
    this.surPay = surPay;
    this.sqCount = sqCount;
    this.sqState = sqState;
  }
}


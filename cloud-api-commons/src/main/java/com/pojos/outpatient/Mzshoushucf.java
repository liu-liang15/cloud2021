package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Mzshoushucf {

  private int ssNo;
  private String ssSeedoNumber;
  private double ssMoney;
  private Date ssDate;
  private int ssZt;

  public Mzshoushucf(){}

  public Mzshoushucf(int ssNo, String ssSeedoNumber, double ssMoney, Date ssDate, int ssZt) {
    this.ssNo = ssNo;
    this.ssSeedoNumber = ssSeedoNumber;
    this.ssMoney = ssMoney;
    this.ssDate = ssDate;
    this.ssZt = ssZt;
  }
}


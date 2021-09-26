package com.pojos.outpatient;

import lombok.Data;

@Data
public class Examinedetails {

  private int exadetNo;
  private int exadetExaordNo;
  private int mealBlipId;
  private int exadetCount;
  private double mealBlipPrice;

  public Examinedetails(){}

  public Examinedetails(int exadetNo, int exadetExaordNo, int mealBlipId, int exadetCount, double mealBlipPrice) {
    this.exadetNo = exadetNo;
    this.exadetExaordNo = exadetExaordNo;
    this.mealBlipId = mealBlipId;
    this.exadetCount = exadetCount;
    this.mealBlipPrice = mealBlipPrice;
  }
}


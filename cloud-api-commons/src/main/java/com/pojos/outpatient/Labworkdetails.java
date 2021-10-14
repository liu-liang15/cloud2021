package com.pojos.outpatient;

import lombok.Data;

@Data
public class Labworkdetails {

  private int labdetNo;
  private String assayMealId;
  private String labdetAssayNo;
  private int labdetCount;
  private double assayMealPrice;
  private int labdetState;

  public Labworkdetails(){}

  public Labworkdetails(int labdetNo, String assayMealId, String labdetAssayNo, int labdetCount, double assayMealPrice, int labdetState) {
    this.labdetNo = labdetNo;
    this.assayMealId = assayMealId;
    this.labdetAssayNo = labdetAssayNo;
    this.labdetCount = labdetCount;
    this.assayMealPrice = assayMealPrice;
    this.labdetState = labdetState;
  }
}


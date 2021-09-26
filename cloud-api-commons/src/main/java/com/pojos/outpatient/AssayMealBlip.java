package com.pojos.outpatient;

import lombok.Data;

@Data
public class AssayMealBlip {

  private int mealBlipId;
  private String mealBlipName;
  private double mealBlipPrice;
  private String mealBlipType;
  private String ksName;

  public AssayMealBlip(){}

  public AssayMealBlip(int mealBlipId, String mealBlipName, double mealBlipPrice, String mealBlipType, String ksName) {
    this.mealBlipId = mealBlipId;
    this.mealBlipName = mealBlipName;
    this.mealBlipPrice = mealBlipPrice;
    this.mealBlipType = mealBlipType;
    this.ksName = ksName;
  }
}


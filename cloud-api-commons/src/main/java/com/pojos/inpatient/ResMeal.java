package com.pojos.inpatient;


public class ResMeal {

  private long resMealNo;
  private String mealId;
  private String resNo;
  private java.sql.Timestamp mealTime;
  private String mealDoc;

  public long getResMealNo() {
    return resMealNo;
  }

  public void setResMealNo(long resMealNo) {
    this.resMealNo = resMealNo;
  }


  public String getMealId() {
    return mealId;
  }

  public void setMealId(String mealId) {
    this.mealId = mealId;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }


  public java.sql.Timestamp getMealTime() {
    return mealTime;
  }

  public void setMealTime(java.sql.Timestamp mealTime) {
    this.mealTime = mealTime;
  }


  public String getMealDoc() {
    return mealDoc;
  }

  public void setMealDoc(String mealDoc) {
    this.mealDoc = mealDoc;
  }

  public ResMeal() {
  }

  public ResMeal(String mealId, String resNo, String mealDoc) {
    this.mealId = mealId;
    this.resNo = resNo;
    this.mealDoc = mealDoc;
  }
}

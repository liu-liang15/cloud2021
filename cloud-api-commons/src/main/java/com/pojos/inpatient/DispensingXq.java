package com.pojos.inpatient;


import com.pojos.pharmacy.YaoPingXx;

public class DispensingXq {

  private long disXqId;
  private String disId;
  private String drugId;
  private long drugNumber;
  private YaoPingXx yaoPingXx;

  public long getDisXqId() {
    return disXqId;
  }

  public void setDisXqId(long disXqId) {
    this.disXqId = disXqId;
  }


  public String getDisId() {
    return disId;
  }

  public void setDisId(String disId) {
    this.disId = disId;
  }


  public String getDrugId() {
    return drugId;
  }

  public void setDrugId(String drugId) {
    this.drugId = drugId;
  }


  public long getDrugNumber() {
    return drugNumber;
  }

  public void setDrugNumber(long drugNumber) {
    this.drugNumber = drugNumber;
  }

  public YaoPingXx getYaoPingXx() {
    return yaoPingXx;
  }

  public void setYaoPingXx(YaoPingXx yaoPingXx) {
    this.yaoPingXx = yaoPingXx;
  }

  public DispensingXq() {
  }

  public DispensingXq(String disId, String drugId, long drugNumber) {
    this.disId = disId;
    this.drugId = drugId;
    this.drugNumber = drugNumber;
  }
}

package com.pojos.inpatient;


import com.pojos.pharmacy.YaoPingXx;

public class SurDrug {

  private long surDrugNo;
  private long surNo;
  private long drugId;
  private long drugNumber;
  private YaoPingXx yaoPingXx;
  public long getSurDrugNo() {
    return surDrugNo;
  }

  public void setSurDrugNo(long surDrugNo) {
    this.surDrugNo = surDrugNo;
  }


  public long getSurNo() {
    return surNo;
  }

  public void setSurNo(long surNo) {
    this.surNo = surNo;
  }


  public long getDrugId() {
    return drugId;
  }

  public void setDrugId(long drugId) {
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

  @Override
  public String toString() {
    return "SurDrug{" +
            "surDrugNo=" + surDrugNo +
            ", surNo=" + surNo +
            ", drugId=" + drugId +
            ", drugNumber=" + drugNumber +
            '}';
  }
}

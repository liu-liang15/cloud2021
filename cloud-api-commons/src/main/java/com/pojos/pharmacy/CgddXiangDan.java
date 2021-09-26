package com.pojos.pharmacy;


public class CgddXiangDan {

  private long purchasesId;
  private String purchaseId;
  private String drugId;
  private String consuId;
  private double jinjia;
  private int drugNumber;
  private YaoPingXx yaoPingXx;
  private HaoCai haoCai;

  public YaoPingXx getYaoPingXx() {
    return yaoPingXx;
  }

  public void setYaoPingXx(YaoPingXx yaoPingXx) {
    this.yaoPingXx = yaoPingXx;
  }

  public HaoCai getHaoCai() {
    return haoCai;
  }

  public void setHaoCai(HaoCai haoCai) {
    this.haoCai = haoCai;
  }

  public double getJinjia() {
    return jinjia;
  }

  public void setJinjia(double jinjia) {
    this.jinjia = jinjia;
  }

  public long getPurchasesId() {
    return purchasesId;
  }

  public void setPurchasesId(long purchasesId) {
    this.purchasesId = purchasesId;
  }


  public String getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }


  public String getDrugId() {
    return drugId;
  }

  public void setDrugId(String drugId) {
    this.drugId = drugId;
  }


  public String getConsuId() {
    return consuId;
  }

  public void setConsuId(String consuId) {
    this.consuId = consuId;
  }


  public int getDrugNumber() {
    return drugNumber;
  }

  public void setDrugNumber(int drugNumber) {
    this.drugNumber = drugNumber;
  }

}

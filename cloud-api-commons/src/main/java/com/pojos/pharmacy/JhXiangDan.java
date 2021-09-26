package com.pojos.pharmacy;


public class JhXiangDan {

  private long planxdId;
  private String planId;
  private String drugId;
  private String consuId;
  private int drugNumber;
  private CaiGoJh caiGoJh;
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

  public CaiGoJh getCaiGoJh() {
    return caiGoJh;
  }

  public void setCaiGoJh(CaiGoJh caiGoJh) {
    this.caiGoJh = caiGoJh;
  }

  public long getPlanxdId() {
    return planxdId;
  }

  public void setPlanxdId(long planxdId) {
    this.planxdId = planxdId;
  }


  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
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

  @Override
  public String toString() {
    return "JhXiangDan{" +
            "planxdId=" + planxdId +
            ", planId='" + planId + '\'' +
            ", drugId='" + drugId + '\'' +
            ", consuId='" + consuId + '\'' +
            ", drugNumber=" + drugNumber +
            '}';
  }
}

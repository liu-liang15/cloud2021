package com.pojos.outpatient;

import lombok.Data;

@Data
public class Prescriptiondetails {

  private int predetNo;
  private String predetPresNo;
  private String drugId;
  private String drugName;
  private String number;
  private double drugShoujia;
  private double xiaoji;
  private String usage;
  private String pinci;
  private String zu;

  public Prescriptiondetails(){}

  @Override
  public String toString() {
    return "Prescriptiondetails{" +
            "predetNo=" + predetNo +
            ", predetPresNo='" + predetPresNo + '\'' +
            ", drugId='" + drugId + '\'' +
            ", drugName='" + drugName + '\'' +
            ", number='" + number + '\'' +
            ", drugShoujia=" + drugShoujia +
            ", xiaoji='" + xiaoji + '\'' +
            ", usage='" + usage + '\'' +
            ", pinci='" + pinci + '\'' +
            ", zu='" + zu + '\'' +
            '}';
  }
}


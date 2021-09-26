package com.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Medicalcardczjl implements Serializable {

  private Integer cardczjlNo;
  private Integer cardczjlMediNo;
  private double cardczjlMoney;
  private Date cardczjlDate;
  private String cardczjlCard;
  private String cardczjlType;
  private Medicalcard medicalcard;

  private static final long serialVersionUID = 1L;

  public Medicalcardczjl() {
  }

  public Medicalcardczjl(Integer cardczjlNo, Integer cardczjlMediNo, double cardczjlMoney, Date cardczjlDate, String cardczjlCard, String cardczjlType) {
    this.cardczjlNo = cardczjlNo;
    this.cardczjlMediNo = cardczjlMediNo;
    this.cardczjlMoney = cardczjlMoney;
    this.cardczjlDate = cardczjlDate;
    this.cardczjlCard = cardczjlCard;
    this.cardczjlType = cardczjlType;
  }
}

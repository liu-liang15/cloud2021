package com.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Medicalcardczjl implements Serializable {

  private Integer cardczjlNo;
  private Integer cardczjlMediNo;//卡号
  private double cardczjlMoney;
  private Date cardczjlDate;
  private String cardczjlCard;//身份证
  private String cardczjlType;//类型
  private String cardczjlYuanyin;
  private String cardczjlLeixing;
  private Medicalcard medicalcard;

  private static final long serialVersionUID = 1L;

  public Medicalcardczjl() {
  }

  public Medicalcardczjl(Integer cardczjlNo, Integer cardczjlMediNo, double cardczjlMoney, Date cardczjlDate, String cardczjlCard, String cardczjlType, String cardczjlYuanyin, String cardczjlLeixing, Medicalcard medicalcard) {
    this.cardczjlNo = cardczjlNo;
    this.cardczjlMediNo = cardczjlMediNo;
    this.cardczjlMoney = cardczjlMoney;
    this.cardczjlDate = cardczjlDate;
    this.cardczjlCard = cardczjlCard;
    this.cardczjlType = cardczjlType;
    this.cardczjlYuanyin = cardczjlYuanyin;
    this.cardczjlLeixing = cardczjlLeixing;
    this.medicalcard = medicalcard;
  }
}

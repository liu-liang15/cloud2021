package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Tuihao {

  private int tuihaoNo;
  private String hospregNo;
  private Date tuihaoDate;
  private String tuihaoYuanyin;
  private String tuihaoCaozuoyuan;

  public Tuihao(){}

  public Tuihao(int tuihaoNo, String hospregNo, Date tuihaoDate, String tuihaoYuanyin, String tuihaoCaozuoyuan) {
    this.tuihaoNo = tuihaoNo;
    this.hospregNo = hospregNo;
    this.tuihaoDate = tuihaoDate;
    this.tuihaoYuanyin = tuihaoYuanyin;
    this.tuihaoCaozuoyuan = tuihaoCaozuoyuan;
  }
}


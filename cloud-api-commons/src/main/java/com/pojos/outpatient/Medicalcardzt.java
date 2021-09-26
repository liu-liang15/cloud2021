package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Medicalcardzt {

  private int no;
  private String mediNo;
  private String caozuo;
  private String caozuoyuan;
  private Date date;
  private String yuanyin;

  public Medicalcardzt(){}

  public Medicalcardzt(int no, String mediNo, String caozuo,String caozuoyuan, Date date, String yuanyin) {
    this.no = no;
    this.mediNo = mediNo;
    this.caozuo = caozuo;
    this.caozuoyuan = caozuoyuan;
    this.date = date;
    this.yuanyin = yuanyin;
  }
}


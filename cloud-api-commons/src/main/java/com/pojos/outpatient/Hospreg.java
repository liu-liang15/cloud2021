package com.pojos.outpatient;

import com.pojos.system.KeShi;
import com.pojos.system.YuanGo;
import lombok.Data;

@Data
public class Hospreg {

  private String horegNo;
  private int horegFamiroomNo;
  private int horegCategoryNo;
  private String horegType;
  private double horegMoney;
  private double horegZhiliaomoney;
  private int horegPatientNo;
  private int horegAttendingdocNo;
  private java.util.Date horegDate;
  private int horegState;
  private String horegOperator;
  private String horegRemark;

  private Hospregcate hospregcate;
  private KeShi keShi;
  private YuanGo yuanGo;
  private Patient patient;


  public Hospreg(){}
}


package com.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Medicalcard implements Serializable {

  private Integer mediNo;
  private String mediCard;
  private String mediPassword;
  private double mediBalance;
  private String mediIdcart;
  private String mediPatientNo;
  private Date mediNewdate;
  private String mediState;
  private Patient patient;

  private static final long serialVersionUID = 1L;

  public Medicalcard() {
  }

  public Medicalcard(Integer mediNo, String mediCard, String mediPassword, double mediBalance, String mediIdcart, String mediPatientNo, Date mediNewdate, String mediState, Patient patient) {
    this.mediNo = mediNo;
    this.mediCard = mediCard;
    this.mediPassword = mediPassword;
    this.mediBalance = mediBalance;
    this.mediIdcart = mediIdcart;
    this.mediPatientNo = mediPatientNo;
    this.mediNewdate = mediNewdate;
    this.mediState = mediState;
    this.patient = patient;
  }
}

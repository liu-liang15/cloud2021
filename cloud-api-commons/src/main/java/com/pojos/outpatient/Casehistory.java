package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Casehistory {

  private int cashisNo;
  private int cashisPatientNo;
  private Date cashisDate;

  private Patient patient;

  public Casehistory(){}

  public Casehistory(int cashisNo, int cashisPatientNo, Date cashisDate, Patient patient) {
    this.cashisNo = cashisNo;
    this.cashisPatientNo = cashisPatientNo;
    this.cashisDate = cashisDate;
    this.patient = patient;
  }
}


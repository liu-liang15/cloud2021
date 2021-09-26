package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Seedoctor {

  private int seedoNo;
  private String seedoNumber;
  private String seedoCahideNo;
  private String seedoPatientNo;
  private String seedoDoctorName;
  private String seedoFamiroomName;
  private String seedoRecord;
  private Date seedoDate;

  private Casehistorydetails casehistorydetails;

  public Seedoctor(){}

  public Seedoctor(int seedoNo, String seedoNumber, String seedoCahideNo, String seedoPatientNo, String seedoDoctorName, String seedoFamiroomName, String seedoRecord, Date seedoDate, Casehistorydetails casehistorydetails) {
    this.seedoNo = seedoNo;
    this.seedoNumber = seedoNumber;
    this.seedoCahideNo = seedoCahideNo;
    this.seedoPatientNo = seedoPatientNo;
    this.seedoDoctorName = seedoDoctorName;
    this.seedoFamiroomName = seedoFamiroomName;
    this.seedoRecord = seedoRecord;
    this.seedoDate = seedoDate;
    this.casehistorydetails = casehistorydetails;
  }
}


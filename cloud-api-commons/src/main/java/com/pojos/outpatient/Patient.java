package com.pojos.outpatient;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Patient implements Serializable {

  private Integer patientNo;
  private String patientName;
  private String patientSex;
  private String patientPhone;
  private String patientIdcart;
  private String patientAge;
  @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
  private Date patientBirthdate;
  private String patientAddress;
  private Date patientDate;

  public Patient(Integer patientNo, String patientName, String patientSex, String patientPhone, String patientIdcart, String patientAge, Date patientBirthdate, String patientAddress, Date patientDate) {
    this.patientNo = patientNo;
    this.patientName = patientName;
    this.patientSex = patientSex;
    this.patientPhone = patientPhone;
    this.patientIdcart = patientIdcart;
    this.patientAge = patientAge;
    this.patientBirthdate = patientBirthdate;
    this.patientAddress = patientAddress;
    this.patientDate = patientDate;
  }

  public Patient() {

  }

  private static final long serialVersionUID = 1L;
}

package com.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Mzshoushujieguo implements Serializable {
    private int no;
    private String mzhao;
    private int patientNo;
    private int shoushuNo;
    private String shoushuName;
    private String jieguo;
    private Date date;
    private Patient patient;

    public Mzshoushujieguo(int no, String mzhao, int patientNo, int shoushuNo, String shoushuName, String jieguo, Date date) {
        this.no = no;
        this.mzhao = mzhao;
        this.patientNo = patientNo;
        this.shoushuNo = shoushuNo;
        this.shoushuName = shoushuName;
        this.jieguo = jieguo;
        this.date = date;
    }

    public Mzshoushujieguo() {
    }

    public Mzshoushujieguo(String mzhao, int patientNo, int shoushuNo, String shoushuName) {
        this.mzhao = mzhao;
        this.patientNo = patientNo;
        this.shoushuNo = shoushuNo;
        this.shoushuName = shoushuName;
    }
}

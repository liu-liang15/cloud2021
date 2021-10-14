package com.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Buka {

    private int bkNo;
    private String bkName;
    private String bkIdcard;
    private Date bkDate;
    private String bkKahaoq;
    private String bkKahaoh;
    private String bkRen;
    private String bkYuanyin;

    public Buka() {
    }

    public Buka(int bkNo, String bkName, String bkIdcard, Date bkDate, String bkKahaoq, String bkKahaoh, String bkRen, String bkYuanyin) {
        this.bkNo = bkNo;
        this.bkName = bkName;
        this.bkIdcard = bkIdcard;
        this.bkDate = bkDate;
        this.bkKahaoq = bkKahaoq;
        this.bkKahaoh = bkKahaoh;
        this.bkRen = bkRen;
        this.bkYuanyin = bkYuanyin;
    }
}


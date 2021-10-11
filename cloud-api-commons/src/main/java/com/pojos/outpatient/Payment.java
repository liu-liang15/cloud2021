package com.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Payment implements Serializable {
    private String No;
    private String mzh;
    private String xm;
    private double zjg;
    private String zffs;
    private Date zfsj;


    public Payment() {
    }

    public Payment(String no, String mzh, String xm, double zjg, String zffs, Date zfsj) {
        No = no;
        this.mzh = mzh;
        this.xm = xm;
        this.zjg = zjg;
        this.zffs = zffs;
        this.zfsj = zfsj;
    }
}

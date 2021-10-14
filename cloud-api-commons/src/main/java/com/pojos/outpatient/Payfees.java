package com.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;

@Data
public class Payfees implements Serializable {
    private String No;
    private String name;
    private String card;
    private String phone;
    private String ks;
    private String ys;
    private double zjg;

    public Payfees() {
    }

    public Payfees(String no, String name, String card, String phone, String ks, String ys, double zjg) {
        No = no;
        this.name = name;
        this.card = card;
        this.phone = phone;
        this.ks = ks;
        this.ys = ys;
        this.zjg = zjg;
    }
}

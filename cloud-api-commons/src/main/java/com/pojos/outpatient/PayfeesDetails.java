package com.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;

@Data
public class PayfeesDetails implements Serializable {
    private int id;
    private String name;
    private int count;
    private String type;
    private double xiaoji;

    public PayfeesDetails() {
    }

    public PayfeesDetails(int id, String name, int count, String type, double xiaoji) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.type = type;
        this.xiaoji = xiaoji;
    }

    @Override
    public String toString() {
        return "PayfeesDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", type='" + type + '\'' +
                ", xiaoji=" + xiaoji +
                '}';
    }
}

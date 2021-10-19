package com.pojos.pharmacy;

import javax.xml.crypto.Data;

//中间表,多条件组合查询用
public class Hibernate {
    //供应商查询参数公司名/联系人/电话
    private String supplyParameter1;
    //供应商查询参数请输入省或市
    private String supplyParameter2;
    //供应商查询参数状态
    private String supplyState;
    private String fayaoType;
    private String fayaoParameter1;
    private String date1;
    private String date2;

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getFayaoType() {
        return fayaoType;
    }

    public void setFayaoType(String fayaoType) {
        this.fayaoType = fayaoType;
    }

    public String getFayaoParameter1() {
        return fayaoParameter1;
    }

    public void setFayaoParameter1(String fayaoParameter1) {
        this.fayaoParameter1 = fayaoParameter1;
    }

    public String getSupplyParameter1() {
        return supplyParameter1;
    }

    public void setSupplyParameter1(String supplyParameter1) {
        this.supplyParameter1 = supplyParameter1;
    }

    public String getSupplyParameter2() {
        return supplyParameter2;
    }

    public void setSupplyParameter2(String supplyParameter2) {
        this.supplyParameter2 = supplyParameter2;
    }

    public String getSupplyState() {
        return supplyState;
    }

    public void setSupplyState(String supplyState) {
        this.supplyState = supplyState;
    }
}

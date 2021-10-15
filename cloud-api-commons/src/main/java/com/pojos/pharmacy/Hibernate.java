package com.pojos.pharmacy;

//中间表,多条件组合查询用
public class Hibernate {
    //供应商查询参数公司名/联系人/电话
    private String supplyParameter1;
    //供应商查询参数请输入省或市
    private String supplyParameter2;
    //供应商查询参数状态
    private String supplyState;

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

package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayInfo {
    @TableId(type = IdType.AUTO)
    private int infoId;
    private int assayPersonId;
    private String assayPersonName;
    private String assayPersonSex;
    private int assayPersonAge;
    private String assayPersonCard;
    private String assayPersonPhone;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date assayPersonTime;
    private String mealName;
    private String assayMealName;
    private String ygName;
    private String ksName;
    private String assayPayNum;
    private String keyboarder;
    private String assayInfoRemark;
    private int imgBean;
    private int mealPd;
    private int fedibeNo;
    private String assayFs;
    private List<AssayRes> assayRes;
    private List<AssayMealImg> assayMealImg;

    public AssayInfo(String assayPersonName, String assayPersonSex, int assayPersonAge, String assayPersonCard, String assayPersonPhone, Date assayPersonTime, String assayMealName, String ygName, String ksName, String assayPayNum, int fedibeNo,String assayFs) {
        this.assayPersonName = assayPersonName;
        this.assayPersonSex = assayPersonSex;
        this.assayPersonAge = assayPersonAge;
        this.assayPersonCard = assayPersonCard;
        this.assayPersonPhone = assayPersonPhone;
        this.assayPersonTime = assayPersonTime;
        this.assayMealName = assayMealName;
        this.ygName = ygName;
        this.ksName = ksName;
        this.assayPayNum = assayPayNum;
        this.fedibeNo = fedibeNo;
        this.assayFs = assayFs;
    }
}

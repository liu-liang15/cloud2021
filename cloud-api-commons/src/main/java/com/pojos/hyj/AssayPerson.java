package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayPerson {
    @TableId(type = IdType.AUTO)
    private Integer assayPersonId;//id
    private String assayPersonName;//姓名
    private String assayPersonSex;//性别
    private int assayPersonAge;//年龄
    private String assayPersonCard;//身份证
    private String assayPersonPhone;//手机号
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Timestamp assayPersonTime;
    private String assayMealName;//体检套餐
    private int assayK;
    private int payType;
    private String mealName;
    private List<AssayRes> assayRes;//体检结果集合

}

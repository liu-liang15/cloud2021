package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayPay {
    @TableId(type = IdType.AUTO)
    private int assayPayId;
    private String assayPayNum;
    private int assayPersonId;
    private double assayPayMoney;
    private String assayPayType;
    private Date assayPayTime;
    private String assayFs;
    private double sunMoney;
}

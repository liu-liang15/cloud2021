package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

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
    private Timestamp assayPayTime;
    private String assayFs;
}

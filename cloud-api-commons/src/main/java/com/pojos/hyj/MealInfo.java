package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MealInfo {
    @TableId(type = IdType.AUTO)
    private int mealInfoId;
    private String mealInfoNum;
    private String assayMealName;
    private String ksName;
    private String assayPayNum;
    private String assayInfoRemark;
    private List<AssayMealImg> assayMealImgs;
}

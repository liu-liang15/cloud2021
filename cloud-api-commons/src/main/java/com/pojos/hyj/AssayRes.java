package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 体检结果表
 */
public class AssayRes {
    @TableId(type = IdType.AUTO)
    private Integer assayResId;
    private String assayProName;//体检项目
    private String assayResInform;//体检结果
    private String assayProUnit;//单位
    private String assayProRef;//参考值
    private int assayPersonId;//体检人id
    private String assayMealName;//体检套餐
    private String assayPayNum;
    private String mealInfoNum;
    private int assayK;//状态
    private List<AssayRes> assayRes;
}

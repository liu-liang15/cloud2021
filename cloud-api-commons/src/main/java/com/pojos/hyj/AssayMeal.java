package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayMeal {
    @TableId(type = IdType.AUTO)
    private Integer assayMealId;
    @TableField(exist = false)
    private int assayProId;
    private String assayMealName;
    private double assayMealPrice;
    private String assayMealType;
    private String ksName;
    @TableField(exist = false)
    private int mealId;
    @TableField(exist = false)
    private List<AssayPro> assayPros;
}

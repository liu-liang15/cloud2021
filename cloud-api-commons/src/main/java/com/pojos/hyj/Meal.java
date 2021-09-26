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
public class Meal {
    @TableId(type = IdType.AUTO)
    private Integer mealId;
    @TableField(exist = false)
    private int assayMealId;
    private String mealName;
    private double mealPrice;
    private String assayTypeType;
    @TableField(exist = false)
    private List<AssayMeal> assayMeals;
}

package com.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MealMiddle {
    private Integer middleId;
    private int mealId;
    private int assayMealId;
    private int mealBlipId;
}

package com.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MealMiddlePro {
    private int mealMiddleId;
    private int assayMealId;
    private int assayProId;
    private String assayTypeType;
}

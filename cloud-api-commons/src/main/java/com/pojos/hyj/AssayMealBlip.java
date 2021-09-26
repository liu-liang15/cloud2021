package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayMealBlip {
    @TableId(type = IdType.AUTO)
    private Integer mealBlipId;
    private String mealBlipName;
    private String mealBlipPrice;
    private String mealBlipType;
    private String ksName;
}

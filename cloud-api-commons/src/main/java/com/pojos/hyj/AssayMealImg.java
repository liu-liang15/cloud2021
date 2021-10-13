package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayMealImg {
    @TableId(type = IdType.AUTO)
    private int mealImgId;
    private String mealImgName;
    private String assayPayNum;
}

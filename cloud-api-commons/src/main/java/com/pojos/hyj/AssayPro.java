package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayPro {
    @TableId(type = IdType.AUTO)
    private Integer assayProId;
    @TableField(exist = false)
    private int assayMealId;
    private String assayProName;//项目名
    @TableField(exist = false)
    private String assayResInform;
    private String assayProRef;//参考值
    private String assayProUnit;//参考值单位
}

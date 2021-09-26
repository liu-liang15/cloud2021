package com.pojos.system;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 班次表
 * @TableName ban_ci
 */
@TableName(value ="ban_ci")
@Data
public class BanCi implements Serializable {
    /**
     * 班次
     */
    private Integer bc;

    /**
     * 开始时间
     */
    private String bcKs;

    /**
     * 结束时间
     */
    private String bcJs;

    /**
     * 班次类型
     */
    private String bcTypeId;

}
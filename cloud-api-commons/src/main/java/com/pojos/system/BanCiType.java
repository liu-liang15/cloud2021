package com.pojos.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 班次类型
 * @TableName ban_ci_type
 */
@TableName(value ="ban_ci_type")
@Data
public class BanCiType implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer bcTypeId;

    /**
     * 类型
     */
    private String bcTypeName;

    /**
     * 时长
     */
    private String bcSc;

}
package com.pojos.system;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 岗位对权限
 * @TableName gw_qx
 */
@TableName(value ="gw_qx")
@Data
@Accessors(chain = true)
public class GwQx implements Serializable {
    /**
     * 岗位ID
     */
    private String gwId;

    /**
     * 权限ID
     */
    private String qxId;

}
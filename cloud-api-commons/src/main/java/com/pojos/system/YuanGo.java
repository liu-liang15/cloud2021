package com.pojos.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * yuan_go
 * @author 
 */
@Data
@TableName(resultMap = "BaseResultMap2")
public class YuanGo implements Serializable {
    /**
     * 员工ID
     */
    @TableId
    private Integer ygId;

    /**
     * 员工名称
     */
    private String ygName;

    /**
     * 员工电话
     */
    private String ygDh;

    /**
     * 员工身份证
     */
    private String ygSfz;

    /**
     * 员工头像
     */
    private String photo;

    /**
     * 员工科室
     */

    private String ksId;
    @TableField(exist = false)
    private KeShi keShi2;

    /**
     * 员工部门
     */
    private String bmId;
    @TableField(exist = false)
    private BuMen buMen2;

    /**
     * 员工角色
     */
    private String gwId;
    @TableField(exist = false)
    private GangWei gangWei2;
    /**
     * 员工对应的用户
     */
    @TableField(exist = false)
    private YongHu yongHu;


}
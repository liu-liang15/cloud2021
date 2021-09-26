package com.pojos.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 权限表
 * @TableName quan_xian
 */
@TableName(value ="quan_xian")
@Data
public class QuanXian implements Serializable {
    /**
     * 权限ID
     */
    @TableId(type = IdType.AUTO)
    private Integer qxId;

    /**
     * 权限名
     */
    private String qxName;

    /**
     * 权限组件名
     */
    private String qxZjm;

    /**
     * 组件路径
     */
    private String qxLj;

    /**
     * 组件图标
     */
    private String qxIoc;

    /**
     * 上级权限（自连接）
     */
    private Integer parentId;

    /**
     * 是否可用
     */
    private Integer sfky;

    /**
     * 权限等级
     */
    private String qxDenji;

    /**
     * 权限组编号（外键）
     */
    private Integer qxzId;
    /**
     * 权限类型
     */
    private String qxType;

    /**
     * 岗位Id
     */
    @TableField(exist = false)
    private String gwId;

    /**
     * 子类权限集合
     */
    @TableField(exist = false)
    List<QuanXian> quanXianList;


}
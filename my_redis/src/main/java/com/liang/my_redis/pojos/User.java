package com.liang.my_redis.pojos;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 刘亮
 * 实现序列化接口  否则无法存入Redis数据库
 * @date 2021年 12月15日21:51
 */
@Data
public class User implements Serializable {
    /**
     * 编号
     */
    private Integer usersId;
    /**
     *姓名
     */
    private String usersName;
    /**
     *性别
     */
    private String usersSex;
    /**
     *出生年月
     */
    private Date usersBrith;
    /**
     * 电话
     */
    private String usersPhone;
}

package com.pojos.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 排班表
 * @TableName pai_ban
 */
@TableName(value ="pai_ban")
@Data
@Accessors(chain = true)
public class PaiBan implements Serializable {
    /**
     * 排班id
     */
    @TableId(type = IdType.AUTO)
    private Integer pbId;

    /**
     * 员工编号
     */
    @TableField(exist = false)
    private YuanGo yg;
    private String ygId;
    /**
     * 班次
     */
    private String bcId;

    /**
     * 排班的日期
     */
    private Date Rq;

    public void setRq2(String rq2) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");
        try {
            this.Rq = ft.parse(rq2);
        } catch (ParseException e) {
            System.err.println("排班的时间转换错误！");
            e.printStackTrace();
        }
    }


}
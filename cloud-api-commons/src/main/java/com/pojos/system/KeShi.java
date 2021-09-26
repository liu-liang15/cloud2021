package com.pojos.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 科室
 * @TableName ke_shi
 */
@TableName(value ="ke_shi")
@Data
public class KeShi implements Serializable {
  /**
   * 编号
   */
  @TableId(type = IdType.AUTO)
  private Integer ksId;

  /**
   * 科室名称
   */
  private String ksName;

  /**
   * 科室主任
   */
  private String ygId;
  /**
   *科室负责人
   */
  @TableField(exist = false)
  private YuanGo yuanGo;

}

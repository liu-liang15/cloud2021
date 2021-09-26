package com.pojos.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class GangWei {

  @TableId
  private Integer gwId;
  private String gwName;
  private String parentId;
  /**
   * 岗位状态
   */
  private Integer State;

  /**
   * 岗位拥有的权限数组
   */
  @TableField(exist=false)
  private String qx[];

  /**
   * 岗位对权限集合
   */
  @TableField(exist = false)
  private List<GwQx> gwQxes;

  @TableField(exist=false)
  private List<GangWei> listgw;

  // 下面是新增排班表根据岗位查的员工的集合
  @TableField(exist = false)
  private List<YuanGo> yuanGos;

  @TableField(exist = false)
  private String ygName;


}

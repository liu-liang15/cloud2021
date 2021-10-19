package com.pojos.system;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class YongHu {
  @TableId
  private Integer yhId;
  private String yhMm;
  private String ygId;
  private String yhKey;
}

package com.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayBlip {
    @TableId(type = IdType.AUTO)
    private Integer assayBlipId;
    private String assayBlipName;
}

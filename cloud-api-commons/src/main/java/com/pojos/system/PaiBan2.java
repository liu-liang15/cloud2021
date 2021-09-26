package com.pojos.system;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 08月06日19:44
 */
@Data
public class PaiBan2 implements Serializable {
    /**
     * 日期
     */
    String rq;
    /**
     * 星期
     */
    String xq;
    /**
     * 指定日期排到的员工
     */
    List<PaiBan> paiBanList;
}

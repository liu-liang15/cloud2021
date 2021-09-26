package com.pojos.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
//以后后台都统一返回这个类
public class CommonResult<T> implements Serializable {

    //    成功与否的信息比如404,200等
    private Integer code;
    //    返回后台的消息，
    private String message;
    //    后台返回的数据
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

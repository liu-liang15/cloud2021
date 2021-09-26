package com.example.util;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Slf4j
@Component //添加到ioc容器
public class MyMetaObjectHandler implements MetaObjectHandler {
    /**
     * 新增数据时，自动注入当前时间
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("assayPersonTime",new Timestamp(System.currentTimeMillis()),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}

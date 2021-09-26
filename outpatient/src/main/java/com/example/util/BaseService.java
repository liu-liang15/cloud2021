package com.example.util;

import java.io.Serializable;
import java.util.List;
public interface BaseService<T> {
     void save(T entity);// 保存

     void delete(T entity);// 删除用户

     void update(T entity);// 更新用户

     T findById(Serializable id);// 根据主键查找用户

     List<T> getAll();// 查看所有

}

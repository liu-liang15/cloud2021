package com.example.model.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.system.QuanXian;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 07月22日16:51
 */
@Mapper
public interface QuanXianDao extends BaseMapper<QuanXian> {
    /**
     * 动态路由查询
     */
    List<QuanXian> router(String gwId);
}

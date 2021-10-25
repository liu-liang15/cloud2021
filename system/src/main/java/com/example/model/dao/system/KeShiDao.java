package com.example.model.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.system.KeShi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeShiDao extends BaseMapper<KeShi> {
    List<KeShi> selectQb(String shou);
    /**
     * 根据科室Id 查询当前住院人数
     */
    String zyrs(String ksId);

    /**
     * 据科室Id 查询每月就诊人数
     * @param ksId
     * @return
     */
    String jzrs(String ksId);
}

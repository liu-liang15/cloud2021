package com.example.model.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.system.BuMen;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BuMenDao extends BaseMapper<BuMen> {
    int deleteByPrimaryKey(Integer bmId);

    int insert(BuMen record);

    BuMen selectByPrimaryKey(Integer bmId);

    List<BuMen> selectByAll(String shou);

    int updateByPrimaryKeySelective(BuMen record);

}
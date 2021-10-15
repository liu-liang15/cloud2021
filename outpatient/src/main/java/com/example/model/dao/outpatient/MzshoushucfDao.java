package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Mzshoushucf;
import com.pojos.outpatient.Mzshoushuxq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MzshoushucfDao extends BaseMapper<Mzshoushucf> {
    void insertMzshoushucf(Mzshoushucf mzshoushucf);

    void insertMzshoushuxq(Mzshoushuxq mzshoushuxq);

    //查询手术详单的状态为1的记录
    List<Mzshoushuxq> selectssxqzt1(String param);

//    查询手术订单，根据门诊号
    Mzshoushucf selectssdd(String param);
    //根据门诊删除处方手术详单状态为1的数据
    void delsscfddzt1(String param);

    void updatecfssddzjg(@Param("jg") double jg,@Param("mzhao") String mzhao);
}

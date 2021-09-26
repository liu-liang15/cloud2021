package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Hospreg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HospregDao extends BaseMapper<Hospreg> {
    //查询所有挂号记录
    List<Hospreg> findAllHopreg(String param);

    //新增挂号
    void insertHospreg(Hospreg hospreg);

    //退号
    void updateHospregTuiHao(int horegState,String horegNo);

    //编辑
    void updateHospreg(Hospreg hospreg);

    List<Hospreg> findJiuZhenLieBiao(int horegState,int horegAttendingdocNo);
}

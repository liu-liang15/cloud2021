package com.example.model.dao.inpatient;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.inpatient.HosAlone;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HosAloneDao extends BaseMapper<HosAlone> {
    //查询住院单
    public List<HosAlone> allHos(String param);
    //根据住院单号查询住院单
    public List<HosAlone> allHos2(String param);
    //新增住院单
    public void addHos(HosAlone hosAlone);
}

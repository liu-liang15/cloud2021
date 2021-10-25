package com.example.model.dao.inpatient;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.inpatient.HosAlone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HosAloneDao extends BaseMapper<HosAlone> {
    //查询住院单
    public List<HosAlone> allHos(String param);
    //多条件查询住院单
    public List<HosAlone> selHosByAll(@Param("name")String name, @Param("idcart")String idcart,
                                      @Param("resNo")String resNo, @Param("hosStay1")String hosStay1,
                                      @Param("hosStay2")String hosStay2,@Param("ksId")String ksId);
    //查询所有住院单
    public List<HosAlone> selHosByZt(@Param("name")String name,@Param("resNo")String resNo,@Param("mediCard")String mediCard);
    //根据住院单号查询住院单
    public List<HosAlone> allHos2(String param);
    //新增住院单
    public void addHos(HosAlone hosAlone);
    //根据诊疗卡查询
    public List<HosAlone> allHos3(String param);
    //改变诊疗卡
    public void changeHos(String param);
    //查询诊疗卡根据诊疗卡id
    public List<HosAlone> selByPatient(String parma);

}

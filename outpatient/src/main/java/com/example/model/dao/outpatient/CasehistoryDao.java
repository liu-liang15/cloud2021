package com.example.model.dao.outpatient;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Casehistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CasehistoryDao extends BaseMapper<Casehistory> {
    List<Casehistory> findAllCaseHistory(@Param("name") String name,@Param("idcard") String idcard,@Param("phone") String phone,@Param("sex") String sex);

    Casehistory findCaseHistorySFZ(String param);

    void insertBingLi(Casehistory casehistory);
}

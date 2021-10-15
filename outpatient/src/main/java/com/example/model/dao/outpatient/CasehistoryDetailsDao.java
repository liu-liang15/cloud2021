package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.outpatient.Casehistorydetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CasehistoryDetailsDao extends BaseMapper<Casehistorydetails> {
    List<Casehistorydetails> findCasehisDetails(int param);

    void insertBingLiXQ(Casehistorydetails casehistorydetails);
    //-- 门诊号查询就诊记录，查询病历详情
    Casehistorydetails findCasehisDetailsBySeenumber(String param);

    void editzhenduanjieguo(@Param("cahideZhenduanjieguo") String cahideZhenduanjieguo,@Param("cahideNo") String cahideNo);
}

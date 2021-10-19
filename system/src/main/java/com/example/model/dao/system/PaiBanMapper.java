package com.example.model.dao.system;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.system.PaiBan;
import com.pojos.system.YuanGo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @Entity generator.domain.PaiBan
*/
@Mapper
public interface PaiBanMapper extends BaseMapper<PaiBan> {
//   查询排班表
    List<PaiBan> getPanBan(@Param("rq") String rq, @Param("ksId") String ksId);

    List<YuanGo> getyg(@Param("ksId") String ksId,@Param("gwId") String gwId, @Param("rq") String rq);
    /**
     *删除某天某个班次的排班
     */
    int delectYgPb(@Param("bcId") String bcId,@Param("rq") String rq);
}

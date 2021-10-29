package com.example.model.dao.system;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.system.PaiBan;
import com.pojos.system.PaiBan3;
import com.pojos.system.YuanGo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @Entity generator.domain.PaiBan
*/
@Mapper
public interface PaiBanMapper extends BaseMapper<PaiBan> {
//   查询排班表
    List<PaiBan> getPanBan(@Param("rq") String rq, @Param("ksId") String ksId);

    List<YuanGo> getyg(@Param("ksId") String ksId,@Param("gwId") String gwId, @Param("rq") String rq,@Param("typeId") int typeId,@Param("bmId") int bmId);
    /**
     *删除某天某个班次的排班
     */
    int delectYgPb(PaiBan3 paiBan3);
    /**
     * 查询当前登录的员工排班
     */
    List getdlpb(String ygId);

}

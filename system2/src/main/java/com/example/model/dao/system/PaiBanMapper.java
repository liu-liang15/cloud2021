package com.example.model.dao.system;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.system.PaiBan;
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

}

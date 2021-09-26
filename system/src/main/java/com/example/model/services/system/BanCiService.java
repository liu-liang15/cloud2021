package com.example.model.services.system;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.model.dao.system.BanCiMapper;
import com.pojos.system.BanCi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
*
*/
@Service
public class BanCiService {
    @Resource
    BanCiMapper banCiMapper;

    /**
     * 根据班次类型查询班次表
     * @param bcType
     * @return
     */
    public List<BanCi> getbc(String bcType){
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("bc_type_id",bcType);
        return banCiMapper.selectList(queryWrapper);
    }
}

package com.example.model.services.system;


import com.example.model.dao.system.BanCiTypeMapper;
import com.pojos.system.BanCiType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
*   班次类型
*/
@Service
public class BanCiTypeService {
        @Resource
        BanCiTypeMapper banCiTypeMapper;

    /**
     * 查询班次类型表
     * @return
     */
    public List<BanCiType> getBcType(){
            return banCiTypeMapper.selectList(null);
        }
}

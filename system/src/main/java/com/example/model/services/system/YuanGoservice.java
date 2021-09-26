package com.example.model.services.system;


import com.example.model.dao.system.YuanGoDao;
import com.pojos.system.GangWei;
import com.pojos.system.YuanGo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class YuanGoservice {
    @Resource
    YuanGoDao yuanGoDao;
//查询员工部分资料
    public List<YuanGo> getYuanGo(){
        return yuanGoDao.selectByAll02();
    }
//查询员工所有资料
    public List<YuanGo> getYuanGoAll(String param){
        return yuanGoDao.selectByAll01(param);
    }

//新增员工
    public int insertyg(YuanGo yuanGo) {
        return yuanGoDao.insert(yuanGo);
    }

    public int updateyg(YuanGo yuanGo) {
        return yuanGoDao.updateById(yuanGo);
    }

    public List<GangWei> getGwdYg(String ksId) {
        List<GangWei> gwdyg = yuanGoDao.getGwdyg(ksId);
        return gwdyg;
    }
//    查询单个员工
    public YuanGo getyg3(String ygId){
        return yuanGoDao.selectById(ygId);
    }
}

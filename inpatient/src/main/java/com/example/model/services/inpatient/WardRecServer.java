package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.WardRecDao;
import com.pojos.inpatient.WardRec;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WardRecServer {
    @Autowired
    WardRecDao wardRecDao;
    //查询病房修改日志
    public List<WardRec> selWardRec(String wardName, String wardCzTime1,String wardCzTime2,String czType){
        return wardRecDao.selWardRec(wardName,wardCzTime1,wardCzTime2,czType);
    }
}

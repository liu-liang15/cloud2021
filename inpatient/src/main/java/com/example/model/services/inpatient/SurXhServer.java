package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.SurXhDao;
import com.pojos.inpatient.SurXh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SurXhServer {
    @Autowired
    SurXhDao surXhDao;
    //查看手术耗材
    public List<SurXh> selSurxh(int param){
        return surXhDao.selSurxh(param);
    }
    //删除手术耗材

}

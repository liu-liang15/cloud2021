package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.AppDisDao;
import com.example.model.dao.inpatient.BedDao;
import com.example.model.dao.inpatient.HosAloneDao;
import com.pojos.inpatient.AppDis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AppDisServer {
    @Autowired
    AppDisDao appDisDao;
    @Autowired
    BedDao bedDao;
    @Autowired
    HosAloneDao hosAloneDao;
    //新增出院申请单
    public void addDisApp(AppDis appDis){
        appDisDao.addAppDis(appDis);
    }
    //查看出院申请单
    public List<AppDis> selAppDis(String param){
       return appDisDao.selAppDis(param);
    }
    //确认出院
    public void changeAppDis(AppDis appDis){
        appDisDao.changeAppDis(appDis);
        hosAloneDao.changeHos(appDis.getResNo());
        bedDao.bedEmpty(appDis.getResNo());
    }
}

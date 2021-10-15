package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.DisPensingDao;
import com.pojos.inpatient.Dispensing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DispensingServer {
    @Autowired
    DisPensingDao disPensingDao;
    //根据住院号查询某患者发药单
    public List<Dispensing> selDis(String param){
        return disPensingDao.selDis(param);
    }
    //查询长期医嘱的待发药单
    public List<Dispensing> selDis2(){
        return disPensingDao.selDis2();
    }
    //查询短期医嘱的待发药单
    public List<Dispensing> selDis3(){
        return disPensingDao.selDis3();
    }
    //修改发药单
    public void changeDis(Dispensing dispensing){
        disPensingDao.changeDis(dispensing);
    }
}

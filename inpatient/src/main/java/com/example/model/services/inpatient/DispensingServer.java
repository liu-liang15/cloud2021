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
    //查询发药单
    public List<Dispensing> selDis(String param){
        return disPensingDao.selDis(param);
    }
    //修改发药单
    public void changeDis(Dispensing dispensing){
        disPensingDao.changeDis(dispensing);
    }
}

package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.ConsAppDao;
import com.pojos.inpatient.ConsApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ConsAppServer {
    @Autowired
    ConsAppDao consAppDao;
    //新增住院手术申请单
    public void addConsApp(ConsApp consApp){
        consAppDao.addConsApp(consApp);
    }
    //查看住院手术申请单
    public List<ConsApp> selConsApp(){
        return consAppDao.selConsApp();
    }
}

package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.ConsAppDao;
import com.example.model.dao.inpatient.ExpCalDao;
import com.example.model.dao.inpatient.SurItemDao;
import com.pojos.hyj.AssayInfo;
import com.pojos.inpatient.ConsApp;
import com.pojos.inpatient.ExpCal;
import com.pojos.inpatient.SurItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ConsAppServer {
    @Autowired
    ConsAppDao consAppDao;
    @Autowired
    SurItemDao surItemDao;
    @Autowired
    ExpCalDao expCalDao;
    @Autowired
    MedicalcardjfjlServer medicalcardjfjlServer ;
    //新增住院手术申请单
    public void addConsApp(ConsApp consApp){
        consAppDao.addConsApp(consApp);
        //得到当前选择的手术的信息
        List<SurItem>list = surItemDao.selSur("","",consApp.getSurNo());
        //消费表里新增一条手术记录
        ExpCal e=new ExpCal(consApp.getResNo(),list.get(0).getSurName(),list.get(0).getSurPay(),1,"手术");
        expCalDao.addExpCal(e);
        //扣费
        medicalcardjfjlServer.loseMoney(consApp.getResNo(),(-list.get(0).getSurPay()));
    }
    //查看住院手术申请单
    public List<ConsApp> selConsApp(String resNo){
        return consAppDao.selConsApp(resNo);
    }
    //修改住院手术申请单
    public void changeCons(ConsApp consApp){
        consAppDao.changeCons(consApp);
    }

}

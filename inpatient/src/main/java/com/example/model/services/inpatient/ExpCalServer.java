package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.ExpCalDao;
import com.pojos.hyj.AssayInfo;
import com.pojos.inpatient.ExpCal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExpCalServer {
    @Autowired
    ExpCalDao expCalDao;
    //查看患者消费
    public List<ExpCal> selExpCal(String param){
        return expCalDao.selExpCal(param);
    }
    //消费总额查询
    public List<ExpCal> selMon(String param){
        return expCalDao.selMon(param);
    }
    //查看结果
    public List<AssayInfo> selectInfoRes(String param){
        return expCalDao.selectInfoRes(param);
    }
}

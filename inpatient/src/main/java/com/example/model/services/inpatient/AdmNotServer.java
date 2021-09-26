package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.AdmNotDao;
import com.pojos.inpatient.AdmNot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class AdmNotServer {
    @Autowired
    AdmNotDao admNotDao;
    //查找住院通知单
    public List<AdmNot> allAdm(String params){
        return admNotDao.selAdm(params);
    }
    //修改住院通知单状态
    public void alterAdm(String hosNO){
        admNotDao.alterAdm(hosNO);
    }
}

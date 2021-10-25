package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.AdmNotDao;
import com.example.model.dao.inpatient.HosAloneDao;
import com.pojos.inpatient.HosAlone;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HosAloneServer {
    @Autowired
    HosAloneDao hosAloneDao;
    @Autowired
    AdmNotDao admNotDao;
    //查询住院单
    public List<HosAlone> allHos(String params){
        return hosAloneDao.allHos(params);
    }
    //多条件查询住院单
    public List<HosAlone> selHosByAll(String name, String idcart,
                                     String resNo,String hosStay1,
                                     String hosStay2,String ksId){
        return  hosAloneDao.selHosByAll(name,idcart,resNo,hosStay1,hosStay2,ksId);
    }
    //查看所有住院通知单
    public List<HosAlone> selHosByZt(String name,String resNo,String mediCard){
        return hosAloneDao.selHosByZt(name,resNo,mediCard);
    }
    //新增住院单并修改住院通知单状态
    public void addHos(HosAlone hosAlone){
        //新增住院单
        hosAloneDao.addHos(hosAlone);
        //修改住院通知单状态
        admNotDao.alterAdm(hosAlone.getHosNo());
        //查询住院单
    }
    //根据住院单号查看住院患者
    public List<HosAlone> selHos2(String param){
        return hosAloneDao.allHos2(param);
    }
}

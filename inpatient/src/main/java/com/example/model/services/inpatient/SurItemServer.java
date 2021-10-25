package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.SurDrugDao;
import com.example.model.dao.inpatient.SurItemDao;
import com.example.model.dao.inpatient.SurXhDao;
import com.pojos.inpatient.SurDrug;
import com.pojos.inpatient.SurItem;
import com.pojos.inpatient.SurXh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SurItemServer {
    @Autowired
    SurItemDao surItemDao;
    @Autowired
    SurXhDao surXhDao;
    @Autowired
    SurDrugDao surDrugDao;
    //新增手术项目
    public String addSur(SurItem surItem){
        //根据手术名查询
        if(surItemDao.selSurBySurName(surItem.getSurName())==null||surItemDao.selSurBySurNameAndId(surItem)!=null){
            surItemDao.addSur(surItem);
            return "ok";
        }else{
            return  "no";
        }
    }
    //查看手术项目
    public List<SurItem> selSur(String param,String ksId,String surNo,String surSco){
        return surItemDao.selSur(param,ksId,surNo,surSco);
    }
    //修改手术项目
    public String upDateSur(SurItem surItem){
        if(surItemDao.selSurBySurName(surItem.getSurName())==null){
            surItemDao.upDateSur(surItem);
            return "ok";
        }else if(surItemDao.selSurBySurNameAndId(surItem)!=null){
            return  "ok";
        }else{
            return  "false";
        }
    }
}

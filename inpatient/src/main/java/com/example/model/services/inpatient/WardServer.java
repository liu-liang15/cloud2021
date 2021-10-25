package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.WardDao;
import com.example.model.dao.inpatient.WardRecDao;
import com.pojos.inpatient.Ward;
import com.pojos.inpatient.WardRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WardServer {
    @Autowired
    WardDao wardDao;
    @Autowired
    WardRecDao wardRecDao;
    //新增病房
    public String addWard(Ward ward){
        if(wardDao.selWardByName(ward.getWardName())==null){
            wardDao.addWard(ward);
            return "ok";
        }else{
            return "false";
        }
    }
    //查看病房
    public List<Ward> selWard(String param){
        return wardDao.selWard(param);
    }
    //多条件查看病房
    public List<Ward> selWardByAll(String name,String ksId,String wardZt){
        return  wardDao.selWardByAll(name,ksId,wardZt);
    }
    //启用停用病房
    public void updateWard(Ward ward, WardRec wardRec){
        wardDao.updateWard(ward);
        wardRecDao.addWardRec(wardRec);
    }
    //修改病房
    public String changeWard(Ward ward){
        if(wardDao.selWardByName(ward.getWardName())==null){
            wardDao.updateWard(ward);
            return "ok";
        }else if(wardDao.selWardByNameAndNo(ward)!=null){
            wardDao.updateWard(ward);
            return "ok";
        }else{
            return "false";
        }
    }
}

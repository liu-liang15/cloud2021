package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.BedCzRecDao;
import com.example.model.dao.inpatient.BedDao;
import com.example.model.dao.inpatient.BedRecDao;
import com.pojos.inpatient.Bed;
import com.pojos.inpatient.BedCzRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BedServer {
    @Autowired
    BedDao bedDao;
    @Autowired
    BedRecDao bedRecDao;
    @Autowired
    BedCzRecDao bedCzRecDao;
    //查询床位
    public List<Bed> selBed(String wardNo, String zt){
        return  bedDao.selBed(wardNo,zt);
    }
    //新增床位
    public void addBed(Bed bed){
        bedDao.addBed(bed);
    }
    //查看患者与床位
    public List<Bed> allocBed(String param){
        return bedDao.allocBed(param);
    }
    //修改床位
    public void updateBed(Bed bed, BedCzRec bedCzRec){
        bedDao.updateBed(bed);
        bedCzRecDao.addBedRec(bedCzRec);
    }
    //床位记录新增
    public void updateBed2(Bed bed){
        bedDao.updateBed(bed);
        bedRecDao.addBedRec(bed.getBedNo()+"",bed.getResNo());
    }
    //查看住院单详表
    public List<Bed> hosXq(String param){
        return bedDao.hosXq(param);
    }
}

package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.BedCzRecDao;
import com.example.model.dao.inpatient.BedDao;
import com.example.model.dao.inpatient.BedRecDao;
import com.example.model.dao.inpatient.ExpCalDao;
import com.pojos.inpatient.Bed;
import com.pojos.inpatient.BedCzRec;
import com.pojos.inpatient.ExpCal;
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
    @Autowired
    MedicalcardjfjlServer medicalcardjfjlServer;
    @Autowired
    ExpCalDao expCalDao;
    //查询床位
    public List<Bed> selBed(String wardNo, String zt){
        return  bedDao.selBed(wardNo,zt);
    }
    //新增床位
    public void addBed(Bed bed,int number){
        int num=0;
        List<Bed>list=bedDao.selBed(bed.getWardNo(),"");
        if(!list.isEmpty()){
            num=list.size();
        }
        for(int i=num+1;i<=num+ number;i++){
            bed.setBedNumber(i);
            bedDao.addBed(bed);
        }
    }
    //查看患者的床位
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
        Bed b=bedDao.selBed2(bed);
        System.out.println("这是原来的床位"+b);
        if(b!=null){
            b.setBedZt("0");
            b.setResNo(null);
            bedDao.updateBed(b);
        }
        bedDao.updateBed(bed);
        bedRecDao.addBedRec(bed);
    }
    //查看住院单详表
    public List<Bed> hosXq(String param){
        return bedDao.hosXq(param);
    }
    //查看有床位的患者并进行床位费扣费
    public void losebedMoney(){
        List<Bed>list=bedDao.selHasBed();
        if(!list.isEmpty()){
            for(int i=0;i<list.size();i++){
                ExpCal e=new ExpCal(list.get(i).getResNo(),"床位日结",list.get(i).getWard().getWardMon(),1,"床位费");
                expCalDao.addExpCal(e);
                medicalcardjfjlServer.loseMoney(list.get(i).getResNo(),(-list.get(i).getWard().getWardMon()));
            }
        }
    }
}

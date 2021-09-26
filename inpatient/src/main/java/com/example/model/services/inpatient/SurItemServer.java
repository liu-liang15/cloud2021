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
    public void addSur(SurItem surItem, List<SurXh> surXhs, List<SurDrug> surDrugs){
        surItemDao.addSur(surItem);
        for (int i=0;i<surXhs.size();i++){
            surXhs.get(i).setSurNo(surItem.getSurNo());
            surXhDao.addSurxh(surXhs.get(i));
        }
        for (int i=0;i<surDrugs.size();i++){
            surDrugs.get(i).setSurNo(surItem.getSurNo());
            surDrugDao.addSurDrug(surDrugs.get(i));
        }
    }
    //查看手术项目
    public List<SurItem> selSur(){
        return surItemDao.selSur();
    }
    //修改手术项目
    public void upDateSur(SurItem surItem, List<SurXh> surXhs, List<SurDrug> surDrugs){
        surItemDao.upDateSur(surItem);
        surXhDao.delSurxh(surItem.getSurNo());
        surDrugDao.delSurDrug(surItem.getSurNo());
        for (int i=0;i<surXhs.size();i++){
            surXhs.get(i).setSurNo(surItem.getSurNo());
            surXhDao.addSurxh(surXhs.get(i));
        }
        for (int i=0;i<surDrugs.size();i++){
            surDrugs.get(i).setSurNo(surItem.getSurNo());
            surDrugDao.addSurDrug(surDrugs.get(i));
        }
    }
}

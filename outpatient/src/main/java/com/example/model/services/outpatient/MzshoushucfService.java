package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.MzshoushucfDao;
import com.example.model.dao.outpatient.PayfeesDao;
import com.pojos.outpatient.Mzshoushucf;
import com.pojos.outpatient.Mzshoushuxq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MzshoushucfService {
    @Autowired
    MzshoushucfDao mzshoushucfDao;
    @Autowired
    PayfeesDao payfeesDao;

    public void insertMzshoushucf(Mzshoushucf mzshoushucf){
        mzshoushucfDao.insertMzshoushucf(mzshoushucf);
    }

    public void insertMzshoushuxq(List<Mzshoushuxq> list, String sqSsNo){
        int ssNo = Integer.parseInt(sqSsNo);
        for(Mzshoushuxq p : list){
            p.setSqSsNo(ssNo);
            p.setSqCount(1);
            mzshoushucfDao.insertMzshoushuxq(p);
        }
    }
    //查询手术详单的状态为1的记录
    public List<Mzshoushuxq> selectssxqzt1(String param){
        return mzshoushucfDao.selectssxqzt1(param);
    }
    //    查询手术订单，根据门诊号
    public Mzshoushucf selectssdd(String param){
        return mzshoushucfDao.selectssdd(param);
    }
    //根据门诊删除处方手术详单状态为1的数据
    public void delsscfddzt1(String param) {
        mzshoushucfDao.delsscfddzt1(param);
    }

    public void updatecfssddzjg(double jg, String mzhao) {
        mzshoushucfDao.updatecfssddzjg(jg,mzhao);

        payfeesDao.updatePayZtSs(mzhao,1);
    }
}

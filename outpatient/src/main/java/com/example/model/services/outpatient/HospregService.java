package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.HospregDao;
import com.pojos.outpatient.Hospreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HospregService {
    @Autowired
    HospregDao hopregDao;

    public List<Hospreg> findAllHopreg(String param){
        return hopregDao.findAllHopreg(param);
    }

    //新增挂号
    public void insertHospreg(Hospreg hospreg){
        hopregDao.insertHospreg(hospreg);
    };

    //退号
    public void updateHospregTuiHao(int horegState,String horegNo){
        hopregDao.updateHospregTuiHao(horegState,horegNo);
    }

    //编辑
    public void updateHospreg(Hospreg hospreg){
        hopregDao.updateHospreg(hospreg);
    }

    public List<Hospreg> findJiuZhenLieBiao(int horegState,int horegAttendingdocNo){
        return hopregDao.findJiuZhenLieBiao(horegState,horegAttendingdocNo);
    }
}

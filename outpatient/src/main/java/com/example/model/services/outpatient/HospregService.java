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

    /*多条件模糊查询挂号记录*/
    public List<Hospreg> findAllHopreg(String mzhao,String ghks,String name,String idcard,String phone,String sj1,String sj2){
        return hopregDao.findAllHopreg(mzhao,ghks,name,idcard,phone,sj1,sj2);
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

    /*查询就诊列表，根据状态，医生编号，升序是否*/
    public List<Hospreg> findJiuZhenLieBiao(int horegState,int horegAttendingdocNo,int asc){
        if(asc == 1){
            return hopregDao.findJiuZhenLieBiao(horegState,horegAttendingdocNo);
        }else{
            return hopregDao.findJiuZhenLieBiao2(horegState,horegAttendingdocNo);
        }
    }
}

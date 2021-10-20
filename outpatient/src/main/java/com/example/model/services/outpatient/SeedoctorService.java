package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.SeedoctorDao;
import com.pojos.outpatient.Mzshoushujieguo;
import com.pojos.outpatient.Seedoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SeedoctorService {
    @Autowired
    SeedoctorDao seedoctorDao;

    /*新增就诊记录*/
    public void insertJiuZhenJiLu(Seedoctor seedoctor){
        seedoctorDao.insertJiuZhenJiLu(seedoctor);
    }

    /*查询就诊记录，根据病历详情编号*/
    public List<Seedoctor> findseedoctor(int param){
        return seedoctorDao.findseedoctor(param);
    }

    /*查询检验检查结果*/
    public List<Seedoctor> selectInfoRes(String mzhao) {
        return seedoctorDao.selectInfoRes(mzhao);
    }

    /*根据门诊号查询门诊手术结果*/
    public List<Mzshoushujieguo> selectmzshoushujieguo(String mzhao) {
        return seedoctorDao.selectmzshoushujieguo(mzhao);
    }

    /*修改门诊手术结果，根据编号*/
    public void updatemzshoushujieguo(String jieguo, int no) {
        seedoctorDao.updatemzshoushujieguo(jieguo,no);
    }
}

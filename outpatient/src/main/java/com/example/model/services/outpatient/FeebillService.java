package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.AssayMealBlipDao;
import com.example.model.dao.outpatient.FeebillDao;
import com.pojos.outpatient.AssayMealBlip;
import com.pojos.outpatient.Feebill;
import com.pojos.outpatient.FeebillDetails;
import com.pojos.outpatient.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.List;

@Service
@Transactional
public class FeebillService {
    @Autowired
    FeebillDao feebillDao;

    public List<Feebill> findAllDFYP(){
        return feebillDao.findAllDFYP();
    }
    //查询缴费记录
    public List<Payment> selJiaoFeiJiLu(String mzhao,String name,String idcard,String phone,String zffs,String sj1,String sj2) throws ParseException {
        return feebillDao.selJiaoFeiJiLu(mzhao,name,idcard,phone,zffs,sj1,sj2);
    }
    //查询缴费记录详情
    public List<FeebillDetails> selJiaoFeiJiLuXq(String param) {
        return feebillDao.selJiaoFeiJiLuXq(param);
    }
}

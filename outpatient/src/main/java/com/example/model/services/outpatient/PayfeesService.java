package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.PayfeesDao;
import com.pojos.outpatient.Feebill;
import com.pojos.outpatient.FeebillDetails;
import com.pojos.outpatient.Payfees;
import com.pojos.outpatient.PayfeesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PayfeesService {
    @Autowired
    PayfeesDao payfeesDao;


    public void updatePayZt(double zongJinE,String param,List<PayfeesDetails> list){
        param = param.substring(1,param.length()-1);
        Feebill feebill = new Feebill(0,param,zongJinE,"微信",null,1,null);
        //新增缴费单
        payfeesDao.insertFeebill(feebill);
        for(PayfeesDetails l : list){
            //新增缴费详单
            System.out.println(l);
            FeebillDetails feebillDetails = new FeebillDetails(0,feebill.getFeebillNo(),l.getId(),l.getName(),l.getXiaoji(),l.getType(),l.getCount());
            payfeesDao.insertFeebillDetails(feebillDetails);
            if(l.getType().equals("药品")){
                payfeesDao.updatePayZtYp(param);
            }else if(l.getType().equals("化验")){
                payfeesDao.updatePayZtHy(param);
            }else if(l.getType().equals("检查")){
                payfeesDao.updatePayZtJc(param);
            }else if(l.getType().equals("手术")){
                payfeesDao.updatePayZtSs(param);
            }
        }
    }


    public List<Payfees> selJiuZhenZJG(String param){
        return payfeesDao.selJiuZhenZJG(param);
    }

    public List<PayfeesDetails> findpaycf(String param){
        return payfeesDao.findpaycf(param);
    }
    public List<PayfeesDetails> findpayhy(String param){
        return payfeesDao.findpayhy(param);
    }
    public List<PayfeesDetails> findpayjc(String param){
        return payfeesDao.findpayjc(param);
    }
    public List<PayfeesDetails> findpayss(String param){
        return payfeesDao.findpayss(param);
    }
}

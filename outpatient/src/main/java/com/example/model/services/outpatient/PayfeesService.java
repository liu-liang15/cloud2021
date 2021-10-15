package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.PayfeesDao;
import com.pojos.hyj.AssayPay;
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

    public void updatePayZt(double zongJinE,String param,List<PayfeesDetails> list,String type){
        param = param.substring(1,param.length()-1);
        Feebill feebill = new Feebill(0,param,zongJinE,type.substring(1,type.length()-1),null,1,null);
        //新增缴费单
        payfeesDao.insertFeebill(feebill);

        for(PayfeesDetails l : list){
            //新增缴费详单
            System.out.println(l);
            FeebillDetails feebillDetails = new FeebillDetails(0,feebill.getFeebillNo(),l.getId(),l.getName(),l.getXiaoji(),l.getType(),l.getCount());
            payfeesDao.insertFeebillDetails(feebillDetails);
            if(l.getType().equals("药品")){
                payfeesDao.updatePayZtYp(param);
                payfeesDao.updateXdZtYp(param);
            }else if(l.getType().equals("化验")){
                payfeesDao.updatePayZtHy(param);
                payfeesDao. updateXdZtJy(param);
            }else if(l.getType().equals("检查")){
                payfeesDao.updatePayZtJc(param);
                payfeesDao.updateXdZtJc(param);
            }else if(l.getType().equals("手术")){
                payfeesDao.updatePayZtSs(param);
                payfeesDao.updateXdZtSs(param);
            }
        }

        //体检
        List<FeebillDetails> feebillDetails= payfeesDao.findId(feebill.getFeebillNo()+"");
        for (int i=0;i<feebillDetails.size();i++){
            AssayPay assayPay=new AssayPay();
            payfeesDao.tjaddjfd(assayPay);
            //体检新增缴费记录
                if("化验".equals(feebillDetails.get(i).getFebideType())){
                    //0化验
                }else if("检查".equals(feebillDetails.get(i).getFebideType())){
                    //1检查
                }
        }
    }


    public List<Payfees> selJiuZhenZJG(String mzhao,String name,String idcard,String phone){
        return payfeesDao.selJiuZhenZJG(mzhao,name,idcard,phone);
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

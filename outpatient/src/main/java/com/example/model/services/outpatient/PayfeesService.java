package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.PayfeesDao;
import com.example.model.dao.outpatient.SeedoctorDao;
import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPay;
import com.pojos.outpatient.*;
import com.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PayfeesService {
    @Autowired
    PayfeesDao payfeesDao;
    @Autowired
            SeedoctorDao seedoctorDao;

    public void updatePayZt(double zongJinE,String param,List<PayfeesDetails> list,String type,String dlr){
        param = param.substring(1,param.length()-1);
        dlr = dlr.substring(1,dlr.length()-1);
        //病人信息
        Patient p = payfeesDao.selectPatientByMzhao(param);
        Feebill feebill = new Feebill(0,param,zongJinE,type.substring(1,type.length()-1),null,1,null);
//        //新增缴费单
        payfeesDao.insertFeebill(feebill);

        for(PayfeesDetails l : list){
            //新增缴费详单
            System.out.println(l);
            FeebillDetails feebillDetails = new FeebillDetails(0,feebill.getFeebillNo(),l.getId(),l.getName(),l.getXiaoji(),l.getType(),l.getCount());
            payfeesDao.insertFeebillDetails(feebillDetails);
            if(l.getType().equals("药品")){
                payfeesDao.updatePayZtYp(param,2);
                payfeesDao.updateXdZtYp(param);
            }else if(l.getType().equals("化验")){
                payfeesDao.updatePayZtHy(param,2);
                payfeesDao. updateXdZtJy(param);
            }else if(l.getType().equals("检查")){
                payfeesDao.updatePayZtJc(param,2);
                payfeesDao.updateXdZtJc(param);
            }else if(l.getType().equals("手术")){
                Mzshoushujieguo mz = new Mzshoushujieguo(param,p.getPatientNo(),l.getId(),l.getName());
                seedoctorDao.insertmzshoushujieguo(mz);
                payfeesDao.updatePayZtSs(param,2);
                payfeesDao.updateXdZtSs(param);
            }
        }




        //体检
        System.out.println(param);
        System.out.println(feebill.getFeebillNo());
        //缴费详单
        List<FeebillDetails> feebillDetails= payfeesDao.findId(feebill.getFeebillNo()+"");
        //dlr 登陆人
        for (int i=0;i<feebillDetails.size();i++){
            FeebillDetails fd = feebillDetails.get(i);
                //          编号 ldWorker  nextId
                IdWorker idWorker = new IdWorker(1,1,1);
                long tjid = idWorker.nextId();

                //查询体检科室根据编号
                AssayMeal jyjcKs = payfeesDao.selectAssayMealById(fd.getFebideId());
                System.out.println(jyjcKs);
                System.out.println(fd);

                AssayPay assayPay=new AssayPay(0,tjid+"",0,fd.getFebideMoney(),type.substring(1,type.length()-1),new Date(),"门诊体检");
                //体检新增缴费记录
                payfeesDao.tjaddjfd(assayPay);

                AssayInfo assayInfo = new AssayInfo(p.getPatientName(),p.getPatientSex(),Integer.parseInt(p.getPatientAge()),p.getPatientIdcart(),p.getPatientPhone(),new Date(),fd.getFebideName(),dlr,jyjcKs.getKsName(),tjid+"",fd.getFebideNo(),"门诊体检");
                payfeesDao.inserttijgjl(assayInfo);
        }
    }


    public List<Payfees> selJiuZhenZJG(String mzhao1,String name2,String idcard3,String phone4){
        return payfeesDao.selJiuZhenZJG(mzhao1,name2,idcard3,phone4);
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

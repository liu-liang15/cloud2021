package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.HosAloneDao;
import com.example.model.dao.inpatient.MedicalcardjfjlDao;
import com.pojos.inpatient.HosAlone;
import com.pojos.inpatient.Medicalcardjfjl;
//import io.seata.spring.annotation.GlobalTransactional;
import com.pojos.outpatient.Medicalcardczjl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class MedicalcardjfjlServer {
    @Resource
    MedicalcardjfjlDao medDao;
    // 这里要通过远程调用 新建一个接口
    @Resource
    MedicalcardDao medao;
    @Autowired
    HosAloneDao hosAloneDao;

    //开启分布式事务
    //@GlobalTransactional
    public void addJfjl(Medicalcardjfjl med){
        //新增充值记录
        medDao.addJfjl(med);
        //修改就诊卡余额
        medDao.updatePat(med.getMecajfjlMoney(),Integer.parseInt(med.getMecajfjlMediNo()));
        Medicalcardczjl medicalcardczjl=new Medicalcardczjl();
        medicalcardczjl.setCardczjlMediNo(Integer.parseInt(med.getMecajfjlMediNo()));
        medicalcardczjl.setCardczjlMoney(med.getMecajfjlMoney());
        medicalcardczjl.setCardczjlType("现金");
        medicalcardczjl.setCardczjlLeixing("充值");
        medicalcardczjl.setCardczjlYuanyin("住院充值");
        medDao.addMedicalcardCzjl(medicalcardczjl);
    }
    //查询充值记录
    public List<Medicalcardjfjl> selPay(Medicalcardjfjl med){
        return medDao.selPay(med);
    }
    //住院扣费
    public void loseMoney(String resNo,double num){
        //创建一个消费记录对象
        Medicalcardjfjl med=new Medicalcardjfjl();
        //根据住院单号查找住院单
        List<HosAlone> list = hosAloneDao.allHos2(resNo);
        //诊疗卡编号
        med.setMecajfjlMediNo(list.get(0).getAdmNot().getMedicalcard().getMediNo()+"");
        //消费金额
        med.setMecajfjlMoney(num);
        //修改诊疗卡余额
        medao.updatePat(med);
        //创建诊疗卡操作记录
        Medicalcardczjl medicalcardczjl=new Medicalcardczjl();
        //诊疗卡编号
        medicalcardczjl.setCardczjlMediNo(list.get(0).getAdmNot().getMedicalcard().getMediNo());
        medicalcardczjl.setCardczjlMoney(num);
        medicalcardczjl.setCardczjlLeixing("缴费");
        medicalcardczjl.setCardczjlYuanyin("住院缴费");
        //新增一条诊疗卡消费记录
        medDao.addMedicalcardCzjl(medicalcardczjl);
    }

}

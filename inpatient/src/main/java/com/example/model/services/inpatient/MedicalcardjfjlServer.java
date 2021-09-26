package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.MedicalcardjfjlDao;
import com.pojos.inpatient.Medicalcardjfjl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalcardjfjlServer {
    @Autowired
    MedicalcardjfjlDao medDao;
    // 这里要通过远程调用
    //@Autowired
    //MedicalcardDao medao;
    public void addJfjl(Medicalcardjfjl med){
        //新增缴费记录
        medDao.addJfjl(med);
        //修改就诊卡余额
        //medao.updatePat(med.getMecajfjlMoney(),Integer.parseInt(med.getMecajfjlMediNo()));
    }
    //查询充值记录
    public List<Medicalcardjfjl> selPay(Medicalcardjfjl med){
        return medDao.selPay(med);
    }
}

package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.MedicalcardjfjlDao;
import com.pojos.inpatient.Medicalcardjfjl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MedicalcardjfjlServer {
    @Resource
    MedicalcardjfjlDao medDao;
    // 这里要通过远程调用 新建一个接口
    @Resource
    MedicalcardDao medao;

    //开启分布式事务
    @GlobalTransactional
    public void addJfjl(Medicalcardjfjl med){
        //新增缴费记录
        medDao.addJfjl(med);
        //修改就诊卡余额f
        medao.updatePat(med);
        //medao.updatePat(med.getMecajfjlMoney(),Integer.parseInt(med.getMecajfjlMediNo()));
    }
    //查询充值记录
    public List<Medicalcardjfjl> selPay(Medicalcardjfjl med){
        return medDao.selPay(med);
    }
}

package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.MedicalcardCzjlDao;
import com.example.model.dao.outpatient.MedicalcardDao;
import com.pojos.outpatient.Medicalcardczjl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalcardCzjlService {
    @Autowired
    MedicalcardCzjlDao medicalcardCzjlDao;
    @Autowired
    MedicalcardDao medicalcardDao;

    public List<Medicalcardczjl> findAllMedicalcardCzjl(String zlkhao,String name,String idcard,String phone,String zffs,String sj1,String sj2){
        return medicalcardCzjlDao.findAllMedicalcardCzjl(zlkhao,name,idcard,phone,zffs,sj1,sj2);
    }

    public void addMedicalcardCzjl(Medicalcardczjl medicalcardczjl){
        medicalcardCzjlDao.addMedicalcardCzjl(medicalcardczjl);
        medicalcardDao.updatePat(medicalcardczjl.getCardczjlMoney(),medicalcardczjl.getCardczjlMediNo());
    }
    //修改卡余额
    public void updatePat(double mediBalance,Integer mediNo){
        medicalcardDao.updatePat(mediBalance,mediNo);
    }

}

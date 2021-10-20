package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.MedicalcardDao;
import com.pojos.outpatient.Buka;
import com.pojos.outpatient.Medicalcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalcardService {
    @Autowired
    MedicalcardDao medicalcardDao;

    /*多条件模糊查询诊疗卡*/
    public List<Medicalcard> findAllMedicalcard(String zlkhao,String name,String idcard,String phone){
        return medicalcardDao.findAllMedicalcard(zlkhao,name,idcard,phone);
    }

    /*查询诊疗卡，根据诊疗卡号*/
    public List<Medicalcard> findMedicalcardByMediCard(String mediCard){
        return medicalcardDao.findMedicalcardByMediCard(mediCard);
    }

    /*新增诊疗卡*/
    public void  addMedicalcard(Medicalcard medicalcard){
        medicalcardDao.addMedicalcard(medicalcard);
    }

    /*修改诊疗卡状态，根据诊疗卡编号*/
    public void medicalcardTY(int mediNo,String mediState){
        medicalcardDao.medicalcardTY(mediNo,mediState);
    }

    /*修改诊疗卡卡号*/
    public void medicalcardBB(int mediNo,String mediCard){
        medicalcardDao.medicalcardBB(mediNo,mediCard);
    }

    //新增补卡记录
    public void insertBuka(Buka buka){
        medicalcardDao.insertBuka(buka);
    }

    //查询补卡记录
    public List<Buka> selectBuKa(String name,String idcard,String zlkhao,String sj1,String sj2) {
        return medicalcardDao.selectBuKa(name,idcard,zlkhao,sj1,sj2);
    }

    /*修改诊疗卡密码，根据诊疗卡编号*/
    public void editPwd(int mediNo,String mediPassword){
        medicalcardDao.editPwd(mediNo,mediPassword);
    }
}

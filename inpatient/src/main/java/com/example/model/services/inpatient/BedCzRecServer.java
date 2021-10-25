package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.BedCzRecDao;
import com.pojos.inpatient.BedCzRec;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BedCzRecServer {
    @Autowired
    BedCzRecDao bedCzRecDao;
    //多条件查看床位操作记录
    public List<BedCzRec> selBedCzRec(String wardName,String bedCzTime1,String bedCzTime2,String czType){
        return bedCzRecDao.selBedCzRec(wardName,bedCzTime1,bedCzTime2,czType);
    }
}

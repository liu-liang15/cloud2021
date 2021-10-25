package com.example.model.services.inpatient;


import com.example.model.dao.inpatient.BedRecDao;
import com.pojos.inpatient.BedRec;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BedRecServer {
    @Autowired
    BedRecDao bedRecDao;
    //查看床位分配记录
    public List<BedRec> selBedRec(String name,String wardName,String bedTime1,String bedTime2){
        return bedRecDao.selBedRec(name,wardName,bedTime1,bedTime2);
    }
}

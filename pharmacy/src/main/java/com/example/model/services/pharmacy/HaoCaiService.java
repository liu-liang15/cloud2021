package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.HaoCaiDao;
import com.pojos.pharmacy.HaoCai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HaoCaiService {
    @Autowired
    HaoCaiDao haoCaiDao;
    //查看消耗品
    public List<HaoCai> selHCName(){
        return haoCaiDao.selHCName();
    }
    //查看消耗品对应规格
    public List<HaoCai> selHCMatr(String param){
        return haoCaiDao.selHCMatr(param);
    }
}

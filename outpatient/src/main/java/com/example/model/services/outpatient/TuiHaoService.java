package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.TuiHaoDao;
import com.pojos.outpatient.Tuihao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TuiHaoService {
    @Autowired
    TuiHaoDao tuiHaoDao;

    public List<Tuihao> findAllTuiHao(String mzhao,String sj1,String sj2){
        return tuiHaoDao.findAllTuiHao(mzhao,sj1,sj2);
    }

    public void insertTuiHao(Tuihao tuihao) {
        tuiHaoDao.insertTuiHao(tuihao);
    }

}

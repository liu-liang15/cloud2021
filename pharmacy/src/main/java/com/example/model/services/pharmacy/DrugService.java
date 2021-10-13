package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.DrugDao;
import com.pojos.pharmacy.YaoPingGg;
import com.pojos.pharmacy.YaoPingLb;
import com.pojos.pharmacy.YaoPingLx;
import com.pojos.pharmacy.YaoPingXx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugService {
    @Autowired
    DrugDao drugDao;

    public   List<YaoPingGg> findAllSpec(){
        return drugDao.findAllSpec();
    };
    public  List<YaoPingLb> findAllSort(){
        return drugDao.findAllSort();
    };
    public List<YaoPingLx> findAllType(){
        return drugDao.findAllType();
    };
    public  List<YaoPingXx> findAllDrug(YaoPingXx yaoPingXx){
        return drugDao.findAllDrug(yaoPingXx);
    };
    public void addDrug(YaoPingXx yaoPingXx){
            drugDao.addDrug(yaoPingXx);
    }

    public int findId(String name,String matr){
        return drugDao.findId(name,matr);
    }
    public void updateDrug(YaoPingXx yaoPingXx){
        drugDao.updateDrug(yaoPingXx);
    }

    public void update(int supplyId){
        //修改供应商信息
        drugDao.update(supplyId);
    }
}

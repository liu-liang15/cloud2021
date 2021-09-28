package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.YaoFangDao;

import com.pojos.outpatient.Feebill;
import com.pojos.pharmacy.FaYao;
import com.pojos.pharmacy.FaoYaoXd;
import com.pojos.pharmacy.YpYaoFang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class YaoFangService {
    @Resource
    YaoFangDao yaoFangDao;
//    @Autowired
//    FeebillDao feebillDaoDao;
    @Resource
    FeebillDao feebillDao;

    public void faYao(FaYao faYao){
        int sum1= yaoFangDao.sum1(faYao.getJfd());
        int sum2= yaoFangDao.sum2(faYao.getJfd());
        if (sum1==sum2){
            yaoFangDao.updateFYD(faYao.getJfd());
        }
        //修改药房药品数量
        List<FaoYaoXd> faoYaoXds= (List<FaoYaoXd>) faYao.getFaoYaoXds();
        for (int i=0;i<faoYaoXds.size();i++){
            yaoFangDao.reduceDrugNumber(faoYaoXds.get(i).getYpSl(),faoYaoXds.get(i).getYpId());
        }
        yaoFangDao.updateFYXD(faYao.getJfd());
        //新增发药主表
        yaoFangDao.addFYD(faYao);
        //新增发药详表
        yaoFangDao.addFYXD(faYao.getFaoYaoXds(), faYao.getFyId());
    }
    //查询药房库存
    public List<YpYaoFang> findAll(){
    return yaoFangDao.findAllYFYP();
    }
    public List<Feebill> findAllDFYP(){
        return feebillDao.findAllDFYP();
    }

}

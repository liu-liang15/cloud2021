package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.YaoFangDao;

import com.pojos.pharmacy.FaYao;
import com.pojos.pharmacy.FaoYaoXd;
import com.pojos.pharmacy.YpYaoFang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class YaoFangService {
    @Autowired
    YaoFangDao yaoFangDao;
    public void faYao(FaYao faYao){

        //修改门诊缴费待代发药品的状态
        yaoFangDao.updateFYXD(faYao.getJfd());
        //修改药房药品数量
        List<FaoYaoXd> faoYaoXds= (List<FaoYaoXd>) faYao.getFaoYaoXds();
        for (int i=0;i<faoYaoXds.size();i++){
            yaoFangDao.reduceDrugNumber(faoYaoXds.get(i).getYpSl(),faoYaoXds.get(i).getYpId());
        }
        //新增发药主表
        yaoFangDao.addFYD(faYao);
        //新增发药详表
        yaoFangDao.addFYXD(faYao.getFaoYaoXds(), faYao.getFyId());
        String fyyy= faYao.getFyYy();
        if(fyyy.equals("门诊发药")){
            //查询某门诊缴费单内所有项目数量
            int sum1= yaoFangDao.sum1(faYao.getJfd());
            //查询某门诊缴费单内所有已完成的项目数量
            int sum2= yaoFangDao.sum2(faYao.getJfd());
            if (sum1==sum2){
                yaoFangDao.updateFYD(faYao.getJfd());
            }
        }else if(fyyy.equals("短期医嘱")){
            System.out.println(fyyy);
            yaoFangDao.changeDis(faYao.getFyRy(),faYao.getJfd());
        }
    }
    //查询药房库存
    public List<YpYaoFang> findAll(){
        return yaoFangDao.findAllYFYP();
    }
}

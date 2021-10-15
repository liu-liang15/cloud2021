package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.RuKuDao;
import com.pojos.pharmacy.RkXiangDan;
import com.pojos.pharmacy.RuKu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Date;

@Service
@Transactional
public class RukuService {
    @Autowired
    RuKuDao ruKuDao;
    public void addRKD(RuKu ruKu){
        //新增入库主表
        ruKuDao.addRKD(ruKu);
        //新增入库详表
        ruKuDao.addRKXD(ruKu.getRkXiangDans(),ruKu.getRhDh());
        //修改采购单
        ruKuDao.updateOrder(ruKu.getPurchaseSjfk(),new Date(),ruKu.getRhd());
        //新增库存记录
        Collection<RkXiangDan> kucun=ruKuDao.FindByIdRuku(ruKu.getRhDh());
        ruKuDao.addKC(kucun);
    }
}

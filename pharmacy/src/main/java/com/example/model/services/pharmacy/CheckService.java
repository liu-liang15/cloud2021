package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.CheckDao;

import com.example.model.dao.pharmacy.XiaoHuiDao;
import com.pojos.pharmacy.ChuKu;
import com.pojos.pharmacy.PanDian;
import com.pojos.pharmacy.YaoKu;
import com.pojos.pharmacy.YpKuCun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CheckService {
    @Autowired
    CheckDao checkDao;
    @Autowired
    XiaoHuiDao xiaoHuiDao;
    public List<YpKuCun> FindByWareKC(int wareId) {
      return checkDao.FindByWareKC(wareId);
    }
    public List<YaoKu> FindAllWare(){
        return checkDao.FindAllWare();
    }
    public void addPD(PanDian panDian){
        checkDao.addPD(panDian);
        //xiaoHuiDao.addXHCK();
        checkDao.addPDXB(panDian.getPangDainXds(),panDian.getPdId());
    }
}

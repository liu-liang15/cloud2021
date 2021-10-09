package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.CheckDao;

import com.example.model.dao.pharmacy.KuCunFayaoDao;
import com.example.model.dao.pharmacy.XiaoHuiDao;
import com.pojos.pharmacy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class CheckService {
    @Autowired
    CheckDao checkDao;
    @Autowired
    KuCunFayaoDao kuCunFayaoDao;
    public List<YpKuCun> FindByWareKC(int wareId) {
      return checkDao.FindByWareKC(wareId);
    }
    public List<YaoKu> FindAllWare(){
        return checkDao.FindAllWare();
    }
    public void addPD(PanDian panDian, XiaoHuiSq xiaoHui){
        if(xiaoHui.getXiaoHuiXds().size() != 0){
            kuCunFayaoDao.addXHSQ(xiaoHui);
            kuCunFayaoDao.addXHXB(xiaoHui.getXiaoHuiXds(), xiaoHui.getXhsqId());
        }
        checkDao.addPD(panDian);
        checkDao.addPDXB(panDian.getPangDainXds(),panDian.getPdId());

       Collection<PangDainXd> pangDainXds= panDian.getPangDainXds();
        for (PangDainXd s : pangDainXds) {
            int sum1= Integer.parseInt(s.getYgSl());
            int sum2= Integer.parseInt(s.getSjSl());
            String id=s.getRkpcId();
            if (sum1 < sum2){
                checkDao.editKucun(sum2,id);
            }
        }
    }
}

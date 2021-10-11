package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.XiaoHuiDao;
import com.pojos.pharmacy.ChuKu;
import com.pojos.pharmacy.ChuKuJiLu;
import com.pojos.pharmacy.XiaoHuiSq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class XiaoHuiService {
    @Autowired
    XiaoHuiDao xiaoHuiDao;
    public List<XiaoHuiSq> findAllXHD(int sq) {
        return xiaoHuiDao.findAllXHD(sq);
    }
    public void editxhd(int zt,String xhsqId){
        xiaoHuiDao.editXiaoHui(zt, xhsqId);
    }
    public void XHChuKu(ChuKu chuKu){
        xiaoHuiDao.addCK(chuKu);
        xiaoHuiDao.editXiaoHui(chuKu.getZt(), chuKu.getXhsqId());
        xiaoHuiDao.addXHCKXQ(chuKu.getChuKuJiLus(), chuKu.getChukuId());
        List<ChuKuJiLu> chuKuJiLus= (List<ChuKuJiLu>) chuKu.getChuKuJiLus();
        for (int i=0;i<chuKuJiLus.size();i++){
            xiaoHuiDao.deltetKucun(chuKuJiLus.get(i).getRkpcId());
        }

    }
}

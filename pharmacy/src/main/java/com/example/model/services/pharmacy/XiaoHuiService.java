package com.example.model.services.pharmacy;

import com.example.model.dao.pharmacy.XiaoHuiDao;
import com.pojos.pharmacy.ChuKu;
import com.pojos.pharmacy.ChuKuJiLu;
import com.pojos.pharmacy.XiaoHuiSq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class XiaoHuiService {
    @Autowired
    XiaoHuiDao xiaoHuiDao;
    //查询所有销毁申请
    public List<XiaoHuiSq> findAllXHD(int sq) {
        return xiaoHuiDao.findAllXHD(sq);
    }
    public void editxhd(int zt,String xhsqId){
        xiaoHuiDao.editXiaoHui(zt, xhsqId);
    }
    public void XHChuKu(ChuKu chuKu){
        xiaoHuiDao.addCK(chuKu);
        xiaoHuiDao.editXiaoHui(chuKu.getZt(), chuKu.getXhsqId());
        List<ChuKuJiLu> chuKuJiLus= (List<ChuKuJiLu>) chuKu.getChuKuJiLus();
        xiaoHuiDao.addXHCKXQ(chuKu.getChuKuJiLus());
        if("盘点销毁".equals(chuKu.getChukuCause())){
            //销毁出库减少对应批次的数量
            for (int i=0;i<chuKuJiLus.size();i++){
                xiaoHuiDao.editKc(chuKuJiLus.get(i).getChuKuSl(),chuKuJiLus.get(i).getRkpcId());
            }
        }else{
            //过期销毁删除改批次记录
            for (int i=0;i<chuKuJiLus.size();i++){
                xiaoHuiDao.deltetKucun(chuKuJiLus.get(i).getRkpcId());
            }
        }
    }
}

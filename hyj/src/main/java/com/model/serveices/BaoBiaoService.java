package com.model.serveices;

import com.model.dao.BaoBiaoMapper;
import com.pojos.hyj.AssayPay;
import com.pojos.inpatient.ExpCal;
import com.pojos.outpatient.Feebill;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BaoBiaoService {
    @Resource
    BaoBiaoMapper baoBiaoMapper;
    public List<Feebill> findFeebMoney(String MTime){
        return baoBiaoMapper.findFeebMoney(MTime);
    }
    public List<ExpCal> findZMoney(String ZTime){
        return baoBiaoMapper.findZMoney(ZTime);
    }
    public List<AssayPay> findPayMoney(String TTime){
        return baoBiaoMapper.findPayMoney(TTime);
    }
}

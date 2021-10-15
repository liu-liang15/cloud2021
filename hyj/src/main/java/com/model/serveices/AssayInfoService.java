package com.model.serveices;

import com.model.dao.AssayInfoMapper;
import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayPay;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayInfoService {
    @Resource
    AssayInfoMapper assayInfoMapper;
    public int addAssayInfo(AssayInfo assayInfo){
        assayInfoMapper.addAssayInfo(assayInfo);
        return 1;
    }
    public void editPersonK(AssayInfo assayInfo){
        assayInfoMapper.editPersonK(assayInfo);
    }
    public List<AssayInfo> selectInfo(){
        return assayInfoMapper.selectInfo();
    }
    public void addPay(AssayPay assayPay){
        assayInfoMapper.addPay(assayPay);
    }
    public void addMealInfo(AssayInfo assayInfo){
        assayInfoMapper.addMealInfo(assayInfo);
    }
    public List<AssayInfo> findMealInfo(){
        return assayInfoMapper.findMealInfo();
    }
}

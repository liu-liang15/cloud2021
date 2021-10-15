package com.model.serveices;

import com.model.dao.AssayResMapper;
import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPerson;
import com.pojos.hyj.AssayRes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayResService {
    @Resource
    AssayResMapper assayResMapper;
    public List<AssayPerson> findRes(AssayPerson assayPerson){
        return assayResMapper.findRes(assayPerson);
    }
    public List<AssayMeal> findMealPro(AssayMeal assayMeal){
        return assayResMapper.findMealPro(assayMeal);
    }
    public List<AssayInfo> findPersonRes(){
        return assayResMapper.findPersonRes();
    }
    public List<AssayMeal> findEnterRes(AssayMeal assayMeal){
        return assayResMapper.findEnterRes(assayMeal);
    }
    public void addRes(AssayRes assayRes){
        assayResMapper.addRes(assayRes.getAssayRes());
    }
    public void editOneK(AssayRes assayRes){
        assayResMapper.editOneK(assayRes.getAssayPersonId());
    }
    public void editZeroK(AssayRes assayRes){
        assayResMapper.editZeroK(assayRes.getAssayPersonId());
    }
    public void delPersonRes(AssayRes assayRes){
        assayResMapper.delPersonRes(assayRes);
    }
    public void editKeyboarder(AssayInfo assayInfo){
        assayResMapper.editKeyboarder(assayInfo);
    }
    public List<AssayMeal> findKsByMeal(AssayMeal assayMeal){
        return assayResMapper.findKsByMeal(assayMeal);
    }
    public List<AssayInfo> selectInfo(){
        return assayResMapper.selectInfo();
    }
    public List<AssayInfo> findInfoRes(AssayInfo assayInfo){
        return assayResMapper.findInfoRes(assayInfo);
    }
    public List<AssayInfo> findInfoImg(AssayInfo assayInfo){
        return assayResMapper.findInfoImg(assayInfo);
    }
}

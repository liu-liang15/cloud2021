package com.model.serveices;

import com.model.dao.AssayResMapper;
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
    public List<AssayPerson> findPersonRes(){
        return assayResMapper.findPersonRes();
    }
    public List<AssayPerson> findEnterRes(){
        return assayResMapper.findEnterRes();
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
}

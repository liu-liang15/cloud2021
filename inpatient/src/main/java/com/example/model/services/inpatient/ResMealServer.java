package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.ExpCalDao;
import com.example.model.dao.inpatient.ResMealDao;
import com.pojos.hyj.AssayMeal;
import com.pojos.inpatient.DocAdv;
import com.pojos.inpatient.ExpCal;
import com.pojos.inpatient.ResMeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResMealServer {
    @Autowired
    ResMealDao resMealDao;
    @Autowired
    ExpCalDao expCalDao;
    //新增检验
    public void addResMeal(DocAdv docAdv, List<AssayMeal> assayMeals){
        for(AssayMeal a:assayMeals){
            ResMeal resMeal=new ResMeal(docAdv.getResNo(),a.getAssayMealId()+"",docAdv.getDocPer());
            //ExpCal e=new ExpCal(docAdv.getResNo(),a.getAssayMealName(),a.getAssayMealPrice());
            //expCalDao.addExpCal(e);
            resMealDao.addResMeal(resMeal);
        }
    }
}

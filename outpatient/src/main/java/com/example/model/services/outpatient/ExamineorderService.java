package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.ExamineorderDao;
import com.pojos.outpatient.Examinedetails;
import com.pojos.outpatient.Examineorder;
import com.pojos.outpatient.Labworkdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExamineorderService {
    @Autowired
    ExamineorderDao examineorderDao;

    public void insertExamineorder(Examineorder examineorder){
        examineorderDao.insertExamineorder(examineorder);
    }

    public void insertExaminedetails(List<Labworkdetails> list, String exaordNo){
        int exaordNo1 = Integer.parseInt(exaordNo);
        for(Labworkdetails p : list){
            examineorderDao.insertExaminedetails(exaordNo1,p.getAssayMealId(),1,p.getAssayMealPrice());
        }
    }
}

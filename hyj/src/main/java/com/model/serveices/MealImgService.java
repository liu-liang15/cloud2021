package com.model.serveices;

import com.model.dao.MealImgMapper;
import com.pojos.hyj.AssayMealImg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MealImgService {
    @Resource
    MealImgMapper mealImgMapper;
    public void addImg(AssayMealImg assayMealImg){
        mealImgMapper.addImg(assayMealImg);
    }
}

package com.model.serveices;

import com.model.dao.MealImgMapper;
import com.pojos.hyj.AssayMealImg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MealImgService {
    @Resource
    MealImgMapper mealImgMapper;
    public void addImg(List<AssayMealImg> mealImgList){
        mealImgMapper.addImg(mealImgList);
    }
}

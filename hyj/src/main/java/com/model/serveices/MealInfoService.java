package com.model.serveices;

import com.model.dao.MealInfoMapper;
import com.pojos.hyj.AssayMealImg;
import com.pojos.hyj.AssayRes;
import com.pojos.hyj.MealInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class MealInfoService {
    @Resource
    MealInfoMapper mealInfoMapper;
    public void addMealInfor(MealInfo mealInfo){
        mealInfoMapper.addMealInfor(mealInfo);
    }
    public void addMealRes(AssayRes assayRes){
        mealInfoMapper.addMealRes(assayRes.getAssayRes());
    }
    public List<MealInfo> findMealOk(MealInfo mealInfo){
        return mealInfoMapper.findMealOk(mealInfo);
    }
    public List<AssayRes> findResInfo(AssayRes assayRes){
        return mealInfoMapper.findResInfo(assayRes);
    }
    public void addInfoImg(List<AssayMealImg> assayMealImgs){
        mealInfoMapper.addInfoImg(assayMealImgs);
    }
    public List<MealInfo> findImgInfo(MealInfo mealInfo){
        return mealInfoMapper.findImgInfo(mealInfo);
    }
}

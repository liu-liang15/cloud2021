package com.model.serveices;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.model.dao.AssayMealMapper;
import com.pojos.hyj.AssayMeal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayMealService {
    @Resource
    AssayMealMapper assayMealMapper;
    //查询化验项目
    public List<AssayMeal> findMeal(){
            return assayMealMapper.findMeal();
    }
    //新增套餐
    public void addMeal(AssayMeal assayMeal){
        assayMealMapper.insert(assayMeal);
        assayMealMapper.addMiddle(assayMeal.getAssayMealId(),assayMeal.getAssayPros());
    }
    //删除套餐
    public void delMeal(AssayMeal assayMeal){
        assayMealMapper.delMeal(assayMeal);
        assayMealMapper.delMiddle(assayMeal);
    }
    //模糊查找套餐
    public List<AssayMeal> likeFind(AssayMeal assayMeal){
        QueryWrapper<AssayMeal> wrapper = new QueryWrapper<>();
        wrapper.like("assay_meal_name",assayMeal.getAssayMealName());
        return assayMealMapper.selectList(wrapper);
    }
    public List<AssayMeal> findAllMeal(){
        return assayMealMapper.findAllMeal();
    }
}

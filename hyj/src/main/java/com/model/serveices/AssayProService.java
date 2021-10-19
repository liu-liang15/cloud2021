package com.model.serveices;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.model.dao.AssayProMapper;
import com.model.dao.AssayTypeMapper;
import com.model.dao.KsMapper;
import com.pojos.hyj.AssayPro;
import com.pojos.hyj.AssayType;
import com.pojos.system.KeShi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayProService {
    @Resource
    AssayProMapper assayProMapper;
    @Resource
    AssayTypeMapper assayTypeMapper;
    @Resource
    KsMapper ksMapper;
    //查询所有
    public List<AssayPro> findAll(){
        return assayProMapper.selectList(null);
    }
    //删除
    public void del(AssayPro assayPro){
        assayProMapper.deleteById(assayPro.getAssayProId());
    }
    //修改
    public void update(AssayPro assayPro){
        assayProMapper.updateById(assayPro);
    }
    //根据id查询
    public AssayPro findById(AssayPro assayPro){
        return assayProMapper.selectById(assayPro.getAssayProId());
    }
    //新增
    public void insert(AssayPro assayPro){
        assayProMapper.insert(assayPro);
    }
    //模糊查询项目列表
    public List<AssayPro> likeData(AssayPro assayPro){
        //mybatis条件构造器
        QueryWrapper<AssayPro> wrapper = new QueryWrapper<>();
        wrapper.like("assay_pro_name",assayPro.getAssayProName());
        return assayProMapper.selectList(wrapper);
    }
    //查询套餐类型
    public List<AssayType> findType(){
        return assayTypeMapper.selectList(null);
    }
    //查询执行科室
    public List<KeShi> findKs(){
        return ksMapper.selectList(null);
    }
    public List<AssayPro> findProByName(AssayPro assayPro){
        return assayProMapper.findProByName(assayPro);
    }
}

package com.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.hyj.AssayPro;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssayProMapper extends BaseMapper<AssayPro> {
    public List<AssayPro> findAllPro();
    List<AssayPro> findProByName(AssayPro assayPro);
}

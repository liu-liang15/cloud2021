package com.model.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojos.hyj.AssayPerson;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AssayMaMapper extends BaseMapper<AssayPerson> {
    @Select("select * from assay_person")
    public List<AssayPerson> findPerson();
    @Delete("delete from assay_person where assay_person_id = #{assayPersonId}")
    public void delPerson(AssayPerson assayPerson);
    //模糊查询
    public List<AssayPerson> likeFindPerson(AssayPerson assayPerson);
    //时间选择器
    public List<AssayPerson> timeChoose(AssayPerson assayPerson);

}

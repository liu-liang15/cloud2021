package com.example.model.dao.inpatient;


import com.pojos.hyj.AssayInfo;
import com.pojos.hyj.AssayMeal;
import com.pojos.hyj.AssayPay;
import com.pojos.inpatient.ExpCal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExpCalDao {
    //查看消费记录
    public List<ExpCal> selExpCal(String param);
    //新增消费记录
    public void addExpCal(ExpCal expCal);
    //消费类型总额查询
    public List<ExpCal> selMon(String param);
    //查找检查或化验
    public List<ExpCal> selJcHy();
    //根据检查 查看 科室
    public AssayMeal selectAssayMealByName(String name);

    void tjaddjfd(AssayPay assayPay);

    void inserttijgjl(AssayInfo assayInfo);

    List<AssayInfo> selectInfoRes(String param);
}

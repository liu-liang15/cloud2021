package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.YaoPingGg;
import com.pojos.pharmacy.YaoPingLb;
import com.pojos.pharmacy.YaoPingLx;
import com.pojos.pharmacy.YaoPingXx;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugDao {
    //查询药品规格
    List<YaoPingGg> findAllSpec();
    //查询药品类别
    List<YaoPingLb> findAllSort();
    //查询药品类型
    List<YaoPingLx> findAllType();
    //查询所有药品
    List<YaoPingXx> findAllDrug(YaoPingXx yaoPingXx);
    //新增药品
    void addDrug(YaoPingXx yaoPingXx);
    //修改药品
    void updateDrug(YaoPingXx yaoPingXx);
    //启用停用药品
    void update(int supplyId);
    //查询供应商名字是否存在,去重用
    int findId(@Param("name") String name,@Param("matr") String mart);
}

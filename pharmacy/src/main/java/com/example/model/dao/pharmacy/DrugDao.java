package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.YaoPingGg;
import com.pojos.pharmacy.YaoPingLb;
import com.pojos.pharmacy.YaoPingLx;
import com.pojos.pharmacy.YaoPingXx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugDao {
    List<YaoPingGg> findAllSpec();
    List<YaoPingLb> findAllSort();
    List<YaoPingLx> findAllType();
    List<YaoPingXx> findAllDrug(YaoPingXx yaoPingXx);
    void addDrug(YaoPingXx yaoPingXx);
    void updateDrug(YaoPingXx yaoPingXx);
    void update(int supplyId);
}

package com.example.model.dao.pharmacy;


import com.pojos.pharmacy.YaoKu;
import com.pojos.pharmacy.YpKuCun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CheckDao {
    List<YpKuCun> FindByWareKC(int wareId);
    List<YaoKu> FindAllWare();
}

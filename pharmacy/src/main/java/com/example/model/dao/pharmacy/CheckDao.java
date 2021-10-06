package com.example.model.dao.pharmacy;


import com.pojos.pharmacy.PanDian;
import com.pojos.pharmacy.PangDainXd;
import com.pojos.pharmacy.YaoKu;
import com.pojos.pharmacy.YpKuCun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface CheckDao {
    List<YpKuCun> FindByWareKC(int wareId);
    List<YaoKu> FindAllWare();
    void addPD(PanDian panDian);
    void addPDXB(@Param("pangDainXds")Collection<PangDainXd> pangDainXds,@Param("pdId")String pdId);
    void editKucun(@Param("sum")int sum,@Param("id")String id);
}

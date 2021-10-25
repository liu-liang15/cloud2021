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
    //查询某仓库的所有药品
    List<YpKuCun> FindByWareKC(int wareId);
    //查询仓库
    List<YaoKu> FindAllWare();
    //新增盘点单
    void addPD(PanDian panDian);
    //新增盘点详单
    void addPDXB(@Param("pangDainXds")Collection<PangDainXd> pangDainXds,@Param("pdId")String pdId);
    //报溢时修改库存
    void editKucun(@Param("sum")int sum,@Param("id")String id);
}

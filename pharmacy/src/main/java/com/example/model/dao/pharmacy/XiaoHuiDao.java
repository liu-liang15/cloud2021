package com.example.model.dao.pharmacy;

import com.pojos.pharmacy.ChuKu;
import com.pojos.pharmacy.ChuKuJiLu;
import com.pojos.pharmacy.XiaoHuiSq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.Collection;
import java.util.List;

@Mapper
public interface XiaoHuiDao {
    List<XiaoHuiSq> findAllXHD(int  sq);
    void editXiaoHui(@Param("zt")int zt,@Param("xhsqId")String xhsqId);
    void deltetKucun(Integer rkpcId);
    void addCK(ChuKu chuKu);
    void addXHCKXQ(Collection<ChuKuJiLu> chuKuJiLus, String chukuId);
}

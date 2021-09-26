package com.example.model.services.system;

import com.example.model.dao.system.BuMenDao;
import com.pojos.system.BuMen;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BuMenservice {
            @Resource
            BuMenDao buMenDao;
//          查询所有部门
            public List<BuMen> getbm(String shou){
                return buMenDao.selectByAll(shou);
            }
//          新增部门
            public int insert(BuMen buMen){
                return buMenDao.insert(buMen);
            }
//          修改部门
            public int updateByPrimaryKeySelective(BuMen record){
                return buMenDao.updateByPrimaryKeySelective(record);
            };



}

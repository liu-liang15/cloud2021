package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.DispensingXqDao;
import com.pojos.inpatient.DispensingXq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@Transactional
public class DispensingXqServer {
    @Autowired
    DispensingXqDao dispensingXqDao;
    //查看发药详单
    @GetMapping("selDisXq")
    public List<DispensingXq> selDisXq(String param){
        return dispensingXqDao.selDisXq(param);
    }
}

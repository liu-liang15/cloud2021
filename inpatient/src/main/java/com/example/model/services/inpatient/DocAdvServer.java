package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.DocAdvDao;
import com.example.model.dao.inpatient.DocAdvXqDao;
import com.example.model.dao.inpatient.DocExeDao;
import com.pojos.inpatient.DocAdv;
import com.pojos.inpatient.DocAdvXq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocAdvServer {
    @Autowired
    DocAdvDao docAdvDao;
    @Autowired
    DocAdvXqDao docAdvXqDao;
    @Autowired
    DocExeDao docExeDao;
    //新增医嘱
    public void addDocAdv(DocAdv docAdv, List<DocAdvXq>docAdvXqs){
        docAdvDao.addDocAdv(docAdv);
        for(DocAdvXq d:docAdvXqs){
            d.setDocAdvNo(docAdv.getDocAdvNo()+"");
            docAdvXqDao.addDocAdvXq(d);
            if(docAdv.getDocType().equals("1")){
                d.setDocEnd(d.getDocStat());
                docAdvXqDao.upDateDocAdvXq(d);
                docExeDao.addDocExe(d.getDocAdvId()+"");
            }
        }
    }
    //查看医嘱
    public List<DocAdv> selDocAdv(String param){
        return docAdvDao.selDocAdv(param);
    }
}

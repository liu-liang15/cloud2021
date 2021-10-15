package com.example.model.services.inpatient;


import com.example.model.dao.inpatient.*;
import com.pojos.inpatient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DocExeServer {
    @Autowired
    DocExeDao docExeDao;
    @Autowired
    DocAdvXqDao docAdvXqDao;
    @Autowired
    ExpCalDao expCalDao;
    @Autowired
    MedicalcardjfjlServer medicalcardjfjlServer ;
    @Autowired
    DisPensingDao disPensingDao;
    @Autowired
    DispensingXqDao dispensingXqDao;
    //新增今日医嘱并查看
    public List<DocExe> selDocExe(String param){
        //获得长期医嘱详情
        List<DocAdvXq> docAdvXqs=docAdvXqDao.serDocAdvXq(param);
        for(DocAdvXq d:docAdvXqs){
            List<DocExe>docExes=docExeDao.nowDocExe(d.getDocAdvId()+"");
            //没找到今天的医嘱则新增
            if(docExes.isEmpty()){
               /* for(int i=0;i<d.getDocFre();i++){
                    docExeDao.addDocExe(d.getDocAdvId()+"");
                }*/
                docExeDao.addDocExe(d.getDocAdvId()+"");
            }
        }
        return docExeDao.selDocExe(param,0);
    }
    //查看临时医嘱
    public List<DocExe> selDocExe2(String param){
        return docExeDao.selDocExe(param,1);
    }
    //确认医嘱执行
    public void upDateDocExe(List<DocExe> docExes,String resNo,Dispensing dispensing){
        ExpCal e=null;
        disPensingDao.addDis(dispensing);
        double num=0;
        Medicalcardjfjl med=new Medicalcardjfjl();
        for (DocExe d:docExes){
            docExeDao.upDateDocExe(d);
            if(d.getYaoPingXx().getDrugTypeId().equals("1")){
                 e=new ExpCal(resNo,d.getYaoPingXx().getDrugName(),d.getDocAdvXq().getDrugNumber()*d.getYaoPingXx().getDrugGrain()*d.getDocAdvXq().getDocFre(),d.getDocAdvXq().getDrugNumber(),"药品");
            }else{
                 e=new ExpCal(resNo,d.getYaoPingXx().getDrugName(),d.getDocAdvXq().getDrugNumber()*d.getYaoPingXx().getDrugShoujia(),d.getDocAdvXq().getDrugNumber(),"药品");
            }
            //新增发药详情
            DispensingXq dispensingXq=new DispensingXq(dispensing.getDisId()+"",d.getYaoPingXx().getDrugId()+"",d.getDocAdvXq().getDrugNumber());
            dispensingXqDao.addDisXq(dispensingXq);
            //价格计算
            num=num-e.getExpPay();
            //
            expCalDao.addExpCal(e);
        }
        medicalcardjfjlServer.loseMoney(resNo,num);
    }
}

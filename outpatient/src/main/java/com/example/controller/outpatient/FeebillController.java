package com.example.controller.outpatient;

import com.example.model.services.outpatient.CasehistoryDetailsService;
import com.example.model.services.outpatient.CasehistoryService;
import com.example.model.services.outpatient.FeebillService;
import com.pojos.outpatient.Casehistory;
import com.pojos.outpatient.Feebill;
import com.pojos.outpatient.FeebillDetails;
import com.pojos.outpatient.Payment;
import com.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/outpatient")
public class FeebillController {

    @Autowired
    FeebillService feebillService;

    @RequestMapping("/findAllDFYP")
    public List<Feebill> findAllDFYP(){
        return feebillService.findAllDFYP();
    }

    //查询缴费记录
    @RequestMapping("/selJiaoFeiJiLu")
    public List<Payment> selJiaoFeiJiLu(String mzhao,String name,String idcard,String phone,String zffs,String sj1,String sj2) throws ParseException {
        DataUtil da = new DataUtil();
        String st1 = da.UTCToCST(sj1, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");//国际时间转换北京时间
        String st2 = da.UTCToCST(sj2, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");//国际时间转换北京时间
        return feebillService.selJiaoFeiJiLu(mzhao,name,idcard,phone,zffs,st1,st2);
    }
    //查询缴费记录详情
    @RequestMapping("/selJiaoFeiJiLuXq")
    public List<FeebillDetails> selJiaoFeiJiLuXq(String param){
        return feebillService.selJiaoFeiJiLuXq(param);
    }

}

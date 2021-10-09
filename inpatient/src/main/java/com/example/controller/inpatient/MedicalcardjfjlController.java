package com.example.controller.inpatient;

import com.example.model.services.inpatient.MedicalcardjfjlServer;
import com.pojos.inpatient.Medicalcardjfjl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inpatient")
public class MedicalcardjfjlController {
    @Autowired
    MedicalcardjfjlServer meds;
    //新增缴费记录
    @PostMapping("/add-med")
    public void addJfjl(@RequestBody Medicalcardjfjl med){
        System.err.println("1234567890");
        meds.addJfjl(med);
    }
    //查询缴费记录
    @PostMapping("selPay")
    public List<Medicalcardjfjl> selPay(@RequestBody Medicalcardjfjl med){
        return meds.selPay(med);
    }
}

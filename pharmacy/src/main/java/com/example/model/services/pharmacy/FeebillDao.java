package com.example.model.services.pharmacy;

import com.pojos.inpatient.Medicalcardjfjl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘亮
 * @date 2021年 09月27日9:00
 */
@Component
@FeignClient(value = "nacos-outpatient")
public interface FeebillDao {
    //@GetMapping("outpatient/updatepat")
    //void updatePat(@PathVariable("mediBalance")double mediBalance, @PathVariable("mediNo") Integer mediNo) ;
    @GetMapping("outpatient/findAllDFYP")
    void findAllDFYP();
}

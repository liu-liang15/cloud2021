package com.example.model.dao.pharmacy;

import com.pojos.outpatient.Feebill;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 09月27日9:00
 */
@Component
//这下面就是别人服务在注册中心的地址，就是别的小伙伴application.yml里面的spring.application.name的名字
@FeignClient(value = "nacos-outpatient")
public interface FeebillDao {
//    @RequestMapping("outpatient/findAllDFYP")
//    List<Feebill> findAllDFYP();
}

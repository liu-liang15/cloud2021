package com.example.model.services.inpatient;

import com.pojos.inpatient.Medicalcardjfjl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 刘亮
 * @date 2021年 09月27日9:00
 */
@Component
//这下面就是别人服务在注册中心的地址，就是别的小伙伴application.yml里面的spring.application.name的名字
@FeignClient(value = "nacos-outpatient")
public interface MedicalcardDao {
    //访问别人controller的地址，就和前端写访问路径一样的，省去了端口
    @GetMapping("outpatient/updatepat")
    void updatePat(Medicalcardjfjl med);
}


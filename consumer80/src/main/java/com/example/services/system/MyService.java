package com.example.services.system;

import com.pojos.system.BanCiType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 09月18日11:44
 */
@FeignClient(value = "nacos-system") //填写去注册中心找的微服务民称
public interface MyService {
    //    =====================班次类型表===================
    @GetMapping("bctype")
    List<BanCiType> getBcType();
}

package com.example.controller.system;


import com.example.services.system.MyService;
import com.pojos.system.BanCiType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


@CrossOrigin
@RestController
public class MyController {
    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}") //需要调用的微服务名称，就是微服务在注册中心的名称
    private  String serverURL;

    @Resource
    private MyService myService;

    @GetMapping("customer/bctype")
    public List getbclx(){
        //return restTemplate.getForObject(serverURL+"bctype", List.class);
        return myService.getBcType();
    }

    @GetMapping("customer/resttemplate/bctype")
    public List getbclx2(){
        return restTemplate.getForObject(serverURL+"bctype", List.class);
    }
}

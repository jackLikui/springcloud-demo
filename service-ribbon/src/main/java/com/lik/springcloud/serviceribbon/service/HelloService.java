package com.lik.springcloud.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: springcloud
 * @Package: com.lik.springcloud.serviceribbon.controller
 * @ClassName: HelloService
 * @Author: chinasoft.k.li
 * @Description: 向注册中心调用服务的demo
 * @Date: 2019/5/16 15:20
 * @Version: 1.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}

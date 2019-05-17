package com.lik.springcloud.serviceribbon.controller;

import com.lik.springcloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud
 * @Package: com.lik.springcloud.serviceribbon.controller
 * @ClassName: HelloController
 * @Author: chinasoft.k.li
 * @Description: 调用服务的controller
 * @Date: 2019/5/16 15:21
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}


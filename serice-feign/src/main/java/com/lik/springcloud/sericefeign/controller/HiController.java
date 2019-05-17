package com.lik.springcloud.sericefeign.controller;

import com.lik.springcloud.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud
 * @Package: com.lik.springcloud.sericefeign
 * @ClassName: Controller
 * @Author: chinasoft.k.li
 * @Description: feign 调用远程服务的hicontroller
 * @Date: 2019/5/16 15:33
 * @Version: 1.0
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}


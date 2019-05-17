package com.lik.springcloud.sericefeign.service;

import com.lik.springcloud.sericefeign.hystrixFallback.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: springcloud
 * @Package: com.lik.springcloud.sericefeign.service
 * @ClassName: FeignService
 * @Author: chinasoft.k.li
 * @Description: feign 调用远程服务
 * @Date: 2019/5/16 15:32
 * @Version: 1.0
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

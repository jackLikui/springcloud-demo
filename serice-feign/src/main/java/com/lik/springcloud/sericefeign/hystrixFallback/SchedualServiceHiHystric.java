package com.lik.springcloud.sericefeign.hystrixFallback;

import com.lik.springcloud.sericefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springcloud
 * @Package: com.lik.springcloud.sericefeign.hystrixFallback
 * @ClassName: falbak
 * @Author: chinasoft.k.li
 * @Description: fallback的类
 * @Date: 2019/5/16 16:16
 * @Version: 1.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}


package cn.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//这里的FeignClient注解里面的value值，填写的就是要访问的服务的服务名。如果写错，就会造成错误
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name") String name);
}

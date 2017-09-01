package cn.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHi(String name) {
        return "sorry for the error " + name + ",this is from feign";
    }
}

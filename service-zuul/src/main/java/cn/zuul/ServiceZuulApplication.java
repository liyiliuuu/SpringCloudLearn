package cn.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*
* @EnableZuulProxy开启Zuul代理模式
* @EnableDiscoveryClient 开启Eureka发现的开关，能被注册到eureka服务注册中心
*
* */

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ServiceZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class,args);
    }
}

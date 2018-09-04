package com.api.feign.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy (proxyTargetClass = true, exposeProxy = true)
@SpringBootApplication (scanBasePackages = {"com.api.feign.event"})
public class Feign {
    public static void main(String[] args) {
        SpringApplication.run(Feign.class,args);
    }
}

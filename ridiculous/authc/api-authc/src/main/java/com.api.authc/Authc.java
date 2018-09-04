package com.api.authc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy (proxyTargetClass = true, exposeProxy = true)
@SpringBootApplication
public class Authc {
    public static void main(String[] args) {

        SpringApplication.run(Authc.class,args);

    }
}

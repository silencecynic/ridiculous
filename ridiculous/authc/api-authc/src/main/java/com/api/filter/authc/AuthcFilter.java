package com.api.filter.authc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy (proxyTargetClass = true , exposeProxy = true)
@SpringBootApplication (scanBasePackages = {"com.api.filter.authc"})
public class AuthcFilter {
  public static void main(String[] args) {
    SpringApplication.run(AuthcFilter.class,args);
  }

}

package com.api.server.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy (proxyTargetClass = true , exposeProxy = true)
@SpringBootApplication (scanBasePackages = {"com.api.server.config"})
public class ServerConfig {
  public static void main(String[] args) {
    SpringApplication.run(ServerConfig.class,args);
  }
}

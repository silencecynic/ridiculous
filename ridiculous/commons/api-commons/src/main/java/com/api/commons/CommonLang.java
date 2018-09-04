package com.api.commons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.api.commons"})
public class CommonLang {
    public static void main(String[] args) {

        SpringApplication.run(CommonLang.class,args);

    }
}

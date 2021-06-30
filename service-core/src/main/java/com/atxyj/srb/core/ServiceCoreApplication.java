package com.atxyj.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: xyj
 * @date: 2021/4/27
 */
@SpringBootApplication
@ComponentScan({"com.atxyj.srb", "com.atxyj.common"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }
}

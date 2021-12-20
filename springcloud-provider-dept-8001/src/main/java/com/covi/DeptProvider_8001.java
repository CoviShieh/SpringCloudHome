package com.covi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiewh
 * @create 2021-12-20 11:34
 * @Description
 */
@SpringBootApplication
//@EnableEurekaClient //服务启动后自动注册到Eureka
//@EnableDiscoveryClient
public class DeptProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class, args);
    }
}

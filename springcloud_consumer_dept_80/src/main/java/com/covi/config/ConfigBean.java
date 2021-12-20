package com.covi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiewh
 * @create 2021-12-20 13:30
 * @Description 提供多种便捷访问远程http服务的方法，简单的Restful服务模板
 */
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

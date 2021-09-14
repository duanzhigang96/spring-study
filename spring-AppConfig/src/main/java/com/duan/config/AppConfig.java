package com.duan.config;

import com.duan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.duan.pojo")
public class AppConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}

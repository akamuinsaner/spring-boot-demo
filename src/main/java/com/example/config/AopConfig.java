package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.example.aop.AopExample;

@Configuration
public class AopConfig {

    @Bean
    public AopExample aopExample() {
        return new AopExample();
    }
}


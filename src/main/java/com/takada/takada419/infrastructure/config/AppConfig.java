package com.takada.takada419.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.takada.takada419.infrastructure.repository")
@ComponentScan(basePackages = "com.takada.takada419")
public class AppConfig {
    @Bean
    public String someConfig() {
        return "Some global configuration setting";
    }
}


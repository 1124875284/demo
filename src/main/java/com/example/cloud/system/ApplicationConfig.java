package com.example.cloud.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.config.TaskExecutorFactoryBean;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskExecutor taskExecutor() {
        TaskExecutorFactoryBean factoryBean = new TaskExecutorFactoryBean();
        factoryBean.setPoolSize("50");
        factoryBean.setQueueCapacity(1500);
        return factoryBean.getObject();
    }
}

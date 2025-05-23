package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

@SpringBootApplication
public class EcommerceYoutubeApplication implements ApplicationListener<ApplicationReadyEvent> {

    private static final Logger logger = LoggerFactory.getLogger(EcommerceYoutubeApplication.class);

    @Value("${spring.datasource.url:}")
    private String datasourceUrl;

    @Value("${spring.datasource.username:}")
    private String datasourceUsername;

    public static void main(String[] args) {
        SpringApplication.run(EcommerceYoutubeApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("Application started with datasource URL: {}", datasourceUrl);
        logger.info("Application started with datasource username: {}", datasourceUsername);
    }
}

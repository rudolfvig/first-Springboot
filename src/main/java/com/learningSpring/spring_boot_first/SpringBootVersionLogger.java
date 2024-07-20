package com.learningSpring.spring_boot_first;

import org.springframework.boot.SpringBootVersion;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class SpringBootVersionLogger {

    @PostConstruct
    public void logVersion() {
        System.out.println("Spring Boot Version: " + SpringBootVersion.getVersion());
    }
}

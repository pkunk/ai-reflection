package com.example.aireflection;

import com.microsoft.applicationinsights.TelemetryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AiReflectionApplication {

    private TelemetryClient telemetryClient;

    public static void main(String[] args) {
        SpringApplication.run(AiReflectionApplication.class, args);
    }

    @PostConstruct
    public void init() {
        this.telemetryClient = new TelemetryClient();
    }
}

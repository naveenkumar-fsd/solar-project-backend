package com.greenenergy.solarsolutions.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.greenenergy.solarsolutions")
@EntityScan(basePackages = "com.greenenergy.solarsolutions.model")
@EnableJpaRepositories(basePackages = "com.greenenergy.solarsolutions.repository")
public class SolarSolutionsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolarSolutionsBackendApplication.class, args);
    }
}

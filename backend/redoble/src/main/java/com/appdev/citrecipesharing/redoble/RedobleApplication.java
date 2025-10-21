package com.appdev.citrecipesharing.redoble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.appdev.citrecipesharing.repository")
@ComponentScan(basePackages = "com.appdev.citrecipesharing")
@EntityScan(basePackages = "com.appdev.citrecipesharing.entity")
public class RedobleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedobleApplication.class, args);
    }

}

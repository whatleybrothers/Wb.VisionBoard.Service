package com.wb.visionboardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@RestController
public class VisionboardserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisionboardserviceApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // https://stackoverflow.com/questions/46065156/access-control-allow-origin-with-spring-boot
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("PUT", "GET", "POST", "OPTIONS", "DELETE", "PATCH");
            }
        };
    }

}

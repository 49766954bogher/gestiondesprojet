package com.ibrahima.gestiondesprojet.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class CorsConfiguration {
    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String DELETE = "DELETE";
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
               // WebMvcConfigurer.super.addCorsMappings(registry);
                registry.addMapping(
                                "/**"
                        )
                        .allowedMethods(POST, GET, DELETE, PUT)
                        .allowedHeaders("*")
                        .allowedOriginPatterns("*")
                        .allowCredentials(true);


            }
        };

    }
}

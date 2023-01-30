package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InterceptorA());
//                .addPathPatterns("/hello/**");
        registry.addInterceptor(new InterceptorB());
//                .addPathPatterns("/goodbye/**");
        registry.addInterceptor(new InterceptorC());
    }
}

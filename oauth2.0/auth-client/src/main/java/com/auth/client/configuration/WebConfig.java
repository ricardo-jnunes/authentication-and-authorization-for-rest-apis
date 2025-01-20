package com.auth.client.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.auth.client.contants.Endpoints;
import com.auth.client.interceptor.BasicAuthenticationInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BasicAuthenticationInterceptor())
        .excludePathPatterns(Endpoints.ENDPOINTS_WITH_AUTHENTICATION_NOT_REQUIRED);
        //.addPathPatterns("/");
    }

}

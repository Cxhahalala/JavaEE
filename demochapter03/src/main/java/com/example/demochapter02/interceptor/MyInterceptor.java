package com.example.demochapter02.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyInterceptor implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;  // 注入拦截器

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求，包括静态资源文件
        registry.addInterceptor(loginInterceptor)  // 使用注入的拦截器
                .addPathPatterns("/**");
    }


}

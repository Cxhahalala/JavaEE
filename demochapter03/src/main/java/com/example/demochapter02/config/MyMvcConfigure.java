package com.example.demochapter02.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyMvcConfigure implements WebMvcConfigurer{
//    重写addResourceHandlers
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/backend/**")
                .addResourceLocations("classpath:/backend/");
        registry.addResourceHandler("/backend")
                .addResourceLocations("classpath:/backend/");
//         registry.addResourceHandler("/images/**")
//                 .addResourceLocations("file:D:/images/");
    }
//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.jsp("/backend/", ".html");
//    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/backend/toLogin")
                .setViewName("/backend/login.html");
        registry.addViewController("/backend")
                .setViewName("/backend/login.html");
    }
    //拦截器默认不会拦截静态文件
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseRegisteredSuffixPatternMatch(true);
    }
}

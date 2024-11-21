package com.example.demochapter02.config;

import com.example.demochapter02.web.FirstServlet;
import com.example.demochapter02.web.MyFilter;
import com.example.demochapter02.web.MyListener;
import com.example.demochapter02.web.SecondServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfigure {

//    @Bean("firstServlet")
//    public FirstServlet firstServlet() {
//        return new FirstServlet();
//    }
//
//    @Bean("secondServlet")
//    public SecondServlet secondServlet() {
//        return new SecondServlet();
//    }
//
//    @Bean
//    public MyFilter myFilter() {
//        return new MyFilter();
//    }
//
//    @Bean
//    public MyListener myListener() {
//        return new MyListener();
//    }
//@Bean
//public ServletRegistrationBean<FirstServlet> firstServletRegistration() {
//    ServletRegistrationBean<FirstServlet> registration = new ServletRegistrationBean<>(new FirstServlet(), "/firstServlet/");
//    return registration;
//}
//
//    @Bean
//    public ServletRegistrationBean<SecondServlet> secondServletRegistration() {
//        ServletRegistrationBean<SecondServlet> registration = new ServletRegistrationBean<>(new SecondServlet(), "/secondServlet/");
//        return registration;
//    }
//
//    @Bean
//    public FilterRegistrationBean<MyFilter> myFilterRegistration() {
//        FilterRegistrationBean<MyFilter> registration = new FilterRegistrationBean<>();
//        registration.setFilter(new MyFilter());
//        registration.addUrlPatterns("/*"); // 设置需要过滤的 URL 模式
//        registration.setOrder(1); // 设置过滤器的优先级
//        return registration;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean<MyListener> myListenerRegistration() {
//        ServletListenerRegistrationBean<MyListener> registration = new ServletListenerRegistrationBean<>(new MyListener());
//        return registration;
//    }
}

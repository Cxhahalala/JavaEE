package com.example.demochapter02.web;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("===============================");
        System.out.println("----Web 应用初始化完成----");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("====================================");
        System.out.println("----Web 应用销毁之前----");
    }
}

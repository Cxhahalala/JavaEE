package com.example.demochapter02;

import com.example.demochapter02.domain.MyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:my.properties")
@ImportResource("classpath:beans.xml")
@EnableConfigurationProperties(MyProperties.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
public class Demochapter02Application {

    public static void main(String[] args) {
        SpringApplication.run(Demochapter02Application.class, args);
    }

}

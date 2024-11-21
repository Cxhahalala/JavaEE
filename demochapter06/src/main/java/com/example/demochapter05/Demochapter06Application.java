package com.example.demochapter05;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Demochapter06Application {

    public static void main(String[] args) {
        SpringApplication.run(Demochapter06Application.class, args);
    }

}

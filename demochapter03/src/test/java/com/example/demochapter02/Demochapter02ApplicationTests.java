package com.example.demochapter02;

import com.example.demochapter02.domain.Chenxin;
import com.example.demochapter02.domain.MyProperties;
import com.example.demochapter02.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = Demochapter02Application.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
class Demochapter02ApplicationTests {
}

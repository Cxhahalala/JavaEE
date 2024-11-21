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
    @Autowired
    private Person person;
    @Test
    void contextLoads() {
        System.out.println("==================");
        System.out.println(person);
    }
    @Autowired
    private Environment env;
    @Autowired
    private MyProperties myProperties;
    @Test
    void testProperties(){
        System.out.println(env.getProperty("my.name"));  // 检查属性是否被正确加载
        System.out.println(env.getProperty("my.courseName"));
        System.out.println(myProperties.toString());
    }
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void iocTest1() {
        System.out.println(applicationContext.containsBean("myService"));
    }
    @Test
    public void iocTest2() {
        System.out.println(applicationContext.containsBean("test"));
    }
    @Autowired
    private Chenxin chenxin;
    @Test
    public void testRandom(){
        System.out.println(chenxin.toString());
    }

}

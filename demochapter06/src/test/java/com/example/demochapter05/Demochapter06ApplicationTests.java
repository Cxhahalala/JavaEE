package com.example.demochapter05;

import com.example.demochapter05.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demochapter06ApplicationTests {
    @Autowired
    private BookService bookService;
    @Test
    public void testCache(){
        bookService.findById(1);
        bookService.findById(1);
    }
}

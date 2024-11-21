package com.example.demochapter05.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demochapter05.dao.BookMapper;
import com.example.demochapter05.entity.EBook;
import com.example.demochapter05.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, EBook> implements BookService {
    // 这里可以实现 BookService 接口中的方法
}


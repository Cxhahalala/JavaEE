package com.example.demochapter05.service.impl;

import com.example.demochapter05.dao.BookRepository;
import com.example.demochapter05.entity.Book;
import com.example.demochapter05.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@CacheConfig(cacheNames = "book")
@Transactional
public  class  BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Cacheable(key = "#id")
    public Book findById(Integer id){
//根据id查找图书信息
        return  bookRepository.findById(id).get();
    }
    @CachePut(key = "#id")
    public  Book updateById(Integer id,String name){
        Book book=this .findById(id);
        book.setName(name);
//更新图书信息
        return  bookRepository.save(book);
    }
    @CacheEvict(key = "#id")
    public  void  delById(Integer id){
//根据id删除图书信息
        bookRepository.deleteById(id);
    }
}

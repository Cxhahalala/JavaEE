package com.example.demochapter05.controller;

import com.example.demochapter05.entity.Book;
import com.example.demochapter05.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public  class  BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("findById/{id}")
    public Book findById(@PathVariable Integer id){
//根据id查询图书信息
        return  bookService.findById(id);
    }
    @RequestMapping("/editById/{id}/{name}")
    public  Book editById(@PathVariable Integer id,@PathVariable String name){
//根据id修改图书的名称
        return  bookService.updateById(id,name);
    }
    @RequestMapping("/delById/{id}")
    public  void  delById(@PathVariable Integer id){
//根据id删除图书信息
        bookService.delById(id);
    }
}

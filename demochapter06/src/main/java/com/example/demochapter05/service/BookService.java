package com.example.demochapter05.service;

import com.example.demochapter05.entity.Book;

public  interface  BookService {
    public Book findById(Integer id);
    public  Book updateById(Integer id,String name);
    public  void  delById(Integer id);
}

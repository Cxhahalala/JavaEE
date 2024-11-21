package com.example.demochapter05.dao;


import com.example.demochapter05.entity.Book;
import  org.springframework.data.jpa.repository.JpaRepository;
import  org.springframework.stereotype.Repository;
@Repository
public  interface  BookRepository extends  JpaRepository<Book,Integer> {
}

package com.example.demochapter02.entity;

import  java.util.ArrayList;
public  class  Data {
    public  static  ArrayList<Book> getData(){
        ArrayList<Book> books=new  ArrayList<>();
        books.add(new  Book(1,"楚辞","屈原","中国文联出版社","0"));
        books.add(new  Book(2,"纳兰词","纳兰性德","中国文联出版社","1"));
        books.add(new  Book(3,"西游记","吴承恩","中国文联出版社","2"));
        return  books;
    }
}

package com.example.demochapter02.entity;

import  java.io.Serializable;
public  class  Book {
    private  Integer id; //图书编号
    private  String name; //图书名称
    private  String author; //图书作者
    private  String press; //图书出版社

    private  String status; //图书状态

    public  Book(Integer id, String name, String author,String press, String status) {
        this .id = id;
        this .name = name;
        this .press = press;
        this .author = author;
        this .status = status;
    }

    public  Integer getId() {
        return  id;
    }

    public  void  setId(Integer id) {
        this .id = id;
    }

    public  String getName() {
        return  name;
    }

    public  void  setName(String name) {
        this .name = name;
    }

    public  String getPress() {
        return  press;
    }

    public  void  setPress(String press) {
        this .press = press;
    }

    public  String getAuthor() {
        return  author;
    }

    public  void  setAuthor(String author) {
        this .author = author;
    }

    public  String getStatus() {
        return  status;
    }

    public  void  setStatus(String status) {
        this .status = status;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}


package com.example.demochapter05.entity;

import  org.springframework.data.annotation.Id;
import  org.springframework.data.redis.core.RedisHash;
import  org.springframework.data.redis.core.index.Indexed;
@RedisHash("user")
public  class  User {
    @Id
    private  Integer id;
    @Indexed
    private  String name;

    public  User() {
    }

    public  User(Integer id, String name) {
        this .id = id;
        this .name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


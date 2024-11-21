package com.example.demochapter02.entity;

import  java.io.Serializable;
public  class  User implements  Serializable {
    private  String name; //用户名称
    private  String role; //用户角色
    public  User(String name, String role) {
        this .name = name;
        this .role = role;
    }
    public  String getName() {
        return  name;
    }
    public  void  setName(String name) {
        this .name = name;
    }
    public  String getRole() {
        return  role;
    }
    public  void  setRole(String role) {
        this .role = role;
    }
}

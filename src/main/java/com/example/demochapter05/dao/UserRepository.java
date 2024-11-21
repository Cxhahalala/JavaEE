package com.example.demochapter05.dao;


import com.example.demochapter05.entity.User;
import  org.springframework.data.repository.CrudRepository;
import  org.springframework.stereotype.Repository;
@Repository("jpaUserRepository")
public  interface  UserRepository extends  CrudRepository<User,Integer> {
}

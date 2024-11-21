package com.example.demochapter02.Controller;

import com.example.demochapter02.entity.Book;
import com.example.demochapter02.entity.Data;
import com.example.demochapter02.entity.User;
import  org.springframework.stereotype.Controller;
import  org.springframework.ui.Model;
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpSession;
import  java.util.ArrayList;
@Controller
@RequestMapping("book")
public  class  BookController {
    //获取所有图书信息
    ArrayList<Book> books = Data.getData();
    /**
     * 查询所有图书
     */
    @RequestMapping("list")
    public  String findBook(Model model, HttpSession session){
        session.setAttribute("user",new  User("zhangsan","ADMIN"));
        model.addAttribute("user",new  User("zhangsan","ADMIN"));
        model.addAttribute("books",books);
        return  "books";
    }
    /**
     *按条件查询图书
     */
    @RequestMapping("search")
    public  String searchBook(Book book,Model model,HttpSession session){
        ArrayList<Book> bs=new  ArrayList<>();
        String bname=book.getName();
        String bauthor=book.getAuthor();
        if (bname.isEmpty()&&bauthor.isEmpty()){
            bs=books;
        }else {
            for  (Book b : books) {
                if ((!bname.isEmpty()&&b.getName().contains(bname))||
                        (!bauthor.isEmpty()&&b.getAuthor().contains(bauthor))){
                    bs.add(b);
                }
            }
        }
        session.setAttribute("user",new  User("zhangsan","ADMIN"));
        model.addAttribute("books",bs);
        return  "books";
    }
    /**
     *获取借阅图书的编号
     */
    @RequestMapping("find/{id}")
    public  String findBook(@PathVariable("id") Integer id){
        System.out.println("申请借阅图书的id："+id);
        return  "books";
    }
}

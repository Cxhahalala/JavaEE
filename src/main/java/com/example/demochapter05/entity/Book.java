package com.example.demochapter05.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // 图书编号

    @Column(name = "name")
    private String name;  // 图书名称

    private String author;  // 作者
    private String press;   // 出版社
    private String status;  // 状态

    // 无参构造方法
    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    // 带参构造方法
    public Book(Integer id, String name, String author, String press, String status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.status = status;
    }

    // 省略 getter 和 setter 方法
    // 省略 toString 方法
}

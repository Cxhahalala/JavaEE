package com.example.demochapter05.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("book")
public class EBook {
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", status='" + status + '\'' +
                '}';
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

    @TableId(type = IdType.AUTO)
    private Integer id;  // 图书编号

    private String name;  // 图书名称
    private String author;  // 作者
    private String press;  // 出版社
    private String status;  // 状态

    // 无参构造方法
    public EBook() {
    }

    // 带参构造方法
    public EBook(Integer id, String name, String author, String press, String status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.status = status;
    }

    // 省略 getter 和 setter 方法
    // 省略 toString 方法
}


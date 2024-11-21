package com.example.demochapter05;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demochapter05.dao.BookMapper;
//import com.example.demochapter05.dao.BookRepository;
import com.example.demochapter05.dao.UserRepository;
import com.example.demochapter05.entity.Book;
import com.example.demochapter05.entity.EBook;
import com.example.demochapter05.entity.User;
import com.example.demochapter05.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class Demochapter05ApplicationTests {
//    @Autowired
//    private BookRepository bookRepository;
//    @Test
//    void booksInfo() {
//        List<Book> books = bookRepository.findAll();
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }
//
//    @Test
//    void saveBook() {
//        Book book = new Book(null, "离骚", "屈原", "清华大学出版社", "1");
//        // 新增图书
//        bookRepository.save(book);
//        booksInfo();
//    }
//
//    @Test
//    void editBook() {
//        Optional<Book> op = bookRepository.findById(1);
//        if (op.isPresent()) {
//            Book book = op.get();
//            book.setName("天问");
//            // 修改图书
//            bookRepository.save(book);
//        }
//        booksInfo();
//    }
//
//    @Test
//    void findBook() {
//        // 根据图书作者和图书状态查找对应的图书
//        Book b = bookRepository.findByAuthorAndStatus("屈原", "1");
//        System.out.println(b);
//    }
//
//    @Test
//    void delBook() {
//        bookRepository.deleteBookById(1);
//        booksInfo();
//    }
@Autowired
private BookMapper bookMapper;

    @Autowired
    private BookService bookService;

    @Test
    public void booksInfo() {
        List<EBook> ebooks = bookMapper.selectList(null);
        for (EBook ebook : ebooks) {
            System.out.println(ebook);
        }
    }

    @Test
    void saveEBook() {
        EBook ebook = new EBook(null, "人间词话", "王国维", "四川文艺出版社", "1");
        // 新增图书信息
        bookMapper.insert(ebook);
        booksInfo();
    }

    @Test
    void findEBook() {
        QueryWrapper<EBook> wrapper = new QueryWrapper<>();
        wrapper.eq("status", 1).like("name", "词");
        // 根据图书状态和图书名称查找对应的图书
        List<EBook> eBooks = bookMapper.selectList(wrapper);
        for (EBook ebook : eBooks) {
            System.out.println(ebook);
        }
    }

    @Test
    void editEBook() {
        System.out.println("--------图书修改前--------");
        booksInfo();

        EBook ebook = bookService.getById(4);
        ebook.setName("楚辞");
        ebook.setPress("中华书局");
        // 根据图书编号修改图书
        bookService.updateById(ebook);

        System.out.println("--------图书修改后--------");
        booksInfo();
    }

    @Test
    void delEBook() {
        // 根据图书编号删除图书信息
        bookService.removeById(4);
        booksInfo();
    }
    @Autowired
    @Qualifier("jpaUserRepository")
    private UserRepository userRepository;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    void  saveTest() {
        User user = new  User(1,"zhangsan");
        userRepository.save(user);
        User u = userRepository.findById(1).get();
        System.out.println(u);
    }
    @Test
    void  stringTest() {
//存入String数据
        stringRedisTemplate.boundValueOps("name").set("lisi");
// 获取String数据
        String name = stringRedisTemplate.boundValueOps("name").get();
        System.out.println("name = " + name);
    }
    @Test
    void  listTest() {
//绑定映射List类型数据的Key
        BoundListOperations<String, String> hobby = stringRedisTemplate.boundListOps("hobby");
//在绑定的键中添加值
        hobby.leftPush("swim");
        hobby.leftPush("travel");
//获取绑定键中的值
        List<String> hbs = hobby.range(0, -1);
        System.out.println(hbs);
    }
    @Test
    void  setTest() {
//绑定映射Set类型数据的Key
        BoundSetOperations<String, String> subject = stringRedisTemplate.boundSetOps("subject");
//添加元素
        subject.add("Chinese");
        subject.add("English");
//获取
        Set<String> members = subject.members();
        System.out.println(members);
    }
    @Test
    void  hashTest() {
//绑定映射List类型数据的Key
        BoundHashOperations<String, Object, Object> role = stringRedisTemplate.boundHashOps("role");
//添加元素
        role.put("admin","wangwu");
        role.put("user","zhaoliu");
        Map<Object, Object> entries = role.entries();
        System.out.println(entries);
    }
}

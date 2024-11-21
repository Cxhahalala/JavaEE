//package com.example.demochapter05.dao;
//
//import com.example.demochapter05.entity.Book;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//import java.util.List;
//
////@Repository
//public interface BookRepository extends JpaRepository<Book, Integer> {
//
//    // 根据作者和状态查找图书
//    Book findByAuthorAndStatus(String author, String status);
//
//    // 根据作者查找图书
//    Book findByAuthor(String author);
//
//    // 根据状态查找图书
//    Book findByStatus(String status);
//
//    // 删除指定ID的图书
//    @Modifying
//    @Transactional
//    @Query("delete from Book b where b.id = :id")
//    void deleteBookById(@Param("id") Integer id);
//}

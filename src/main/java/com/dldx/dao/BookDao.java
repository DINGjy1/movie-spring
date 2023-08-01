package com.dldx.dao;

import com.dldx.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    //查所有
    List<Book> getAllBooks();
    //按编号查询
    Book getBookByBookNo(Integer bookNo);

    int addBook(Book book);

    int updateBook(Book book);

    int deleteBook(Integer bookNo);
}

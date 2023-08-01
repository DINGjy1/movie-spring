package com.dldx.service;

import com.dldx.pojo.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    Book getBookByBookNo(Integer bookNo);

    int addBook(Book book);

    int updateBook(Book book);

    int deleteBook(Integer bookNo);
}

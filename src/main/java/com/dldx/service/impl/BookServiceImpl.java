package com.dldx.service.impl;

import com.dldx.dao.BookDao;
import com.dldx.pojo.Book;
import com.dldx.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao ;
    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Book getBookByBookNo(Integer bookNo) {
        return bookDao.getBookByBookNo(bookNo);
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public int deleteBook(Integer bookNo) {
        return bookDao.deleteBook(bookNo);
    }
}

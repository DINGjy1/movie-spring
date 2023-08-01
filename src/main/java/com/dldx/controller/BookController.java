package com.dldx.controller;

import com.dldx.pojo.Book;
import com.dldx.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {
    @Resource
   private BookService bookService;

    @GetMapping("/book/allbooks")
    public List<Book> getAllBooks(){
        return  bookService.getAllBooks();
    }

    @GetMapping("/book/{bookNo}")
    public Book getOneBook(@PathVariable  Integer bookNo){
        return bookService.getBookByBookNo(bookNo);
    }

    @PutMapping("/book/book")
    public String updateBook(@RequestBody Book book){
        String msg="Error";
        int num = bookService.updateBook(book);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }
    @PostMapping("/book/book")
    public String insertBook(Book book){
        String msg="Erroe";
        int num = bookService.addBook(book);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }

    @DeleteMapping("/book/{bookNo}")
    public String deleteBook(@PathVariable Integer bookNo){
        String msg="Error";
        int num = bookService.deleteBook(bookNo);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }


}

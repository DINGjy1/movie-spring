package com.dldx.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {
    //属性名 和表中列名 必须一一对应
    private Integer bookNo;
    private String bookName;
    private Double price;
    private String author;
    private String publisher;

}

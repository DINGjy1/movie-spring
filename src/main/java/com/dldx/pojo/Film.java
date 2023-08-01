package com.dldx.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Film {
    //属性名 和表中列名 必须一一对应
    private Integer filmNo;
    private String name;
    private String country;
    private String director;
    private String role;
    private String category;
    private Integer grade;
    private String profile;

}

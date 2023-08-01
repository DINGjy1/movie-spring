package com.dldx.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    //属性名 和表中列名 必须一一对应
    private long id;
    private String name;
    private String pwd;

}

package com.dldx.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Food {
    //属性名 和表中列名 必须一一对应
    private Integer foodNo;
    private String foodName;
    private Float price;
    private Integer stock;

}

package com.dldx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
/*
*   @Component 让容器帮助我们创建对象
    @Data  get/set /toString
    @NoArgsConstructor 无参构造器
    @AllArgsConstructor 带参构造器
* */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    //商品编号
    private  Integer  id;
    //商品名称
    private String goodsName;
    //类别编号
    private Integer catId;
    //单价
    private Double price;
    //图片名称
    private String picPath;
    //描述
    private  String description;
}

package com.dldx.controller;

import com.dldx.common.Consts;
import com.dldx.pojo.Goods;
import com.dldx.service.GoodsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


@RestController
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @GetMapping("/goods/allGoods")
    public List<Goods> getAllGoods(){
        return goodsService.getAllGoods();
    }

    @GetMapping("/goods/Goods/{id}")
    public Goods getOneGoods(@PathVariable  Integer id){
        return goodsService.getGoodsById(id);
    }

    @PostMapping("/goods/uploadPic")
    public String addPic(MultipartFile file) throws IOException {
        String path = Consts.BASE_PATH + file.getOriginalFilename();
        //file.transferTo();
        file.transferTo(Paths.get(path));
        System.out.println(path);
        return "success";
    }

    @PostMapping("/goods/goods")
    public String addGoods(Goods goods) {
        System.out.println("添加商品");

        int num = goodsService.addGoods(goods);
        String msg="Error";
        if(num >0){
            msg = "Success";
        }
        return msg;
    }

    @PutMapping("/goods/goods")
    public String updateGoods(@RequestBody Goods goods) {
        System.out.println("更新商品");
        int num = goodsService.updateGoods(goods);
        String msg="Error";
        if(num >0){
            msg = "Success";
        }
        return msg;
    }

    @DeleteMapping("/goods/goods/{id}")
    public String deleteGoods(@PathVariable Integer id) {
        System.out.println("删除商品");
       int num = goodsService.deleteGoods(id);
        String msg="Error";
        if(num >0){
            msg = "Success";
        }
        return msg;
    }


}

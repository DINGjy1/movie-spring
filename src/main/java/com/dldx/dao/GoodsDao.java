package com.dldx.dao;

import com.dldx.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsDao {
    //查询所有
    List<Goods> getAllGoods();
    //按照主键查询
    Goods getGoodsById(Integer id);
    //添加
    int addGoods(Goods goods);
    //删除
    int deleteGoods(Integer id);
    //更新
    int updateGoods(Goods goods);
}

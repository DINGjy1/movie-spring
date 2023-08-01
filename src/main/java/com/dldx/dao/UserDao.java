package com.dldx.dao;

import com.dldx.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    //查所有
    List<User> getAllUsers();
    //按编号查询
    User getUserByUserNo(Integer id);

    int addUser(User user);

    User getUser(String name, String pwd);

    int updateUser(User user);

    int deleteUser(Integer id);
}

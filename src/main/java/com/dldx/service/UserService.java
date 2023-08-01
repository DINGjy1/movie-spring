package com.dldx.service;

import com.dldx.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserByUserNo(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

    User getUser(String name, String pwd);
}

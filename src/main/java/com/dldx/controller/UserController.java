package com.dldx.controller;

import com.dldx.pojo.User;
import com.dldx.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
   private UserService userService;

    @GetMapping("/user/User/{name}/{pwd}")
    public User getUser(@PathVariable String name,@PathVariable String pwd){
        return userService.getUser(name, pwd);
    }

    @GetMapping("/user/allusers")
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getOneUser(@PathVariable  Integer id){
        return userService.getUserByUserNo(id);
    }

    @PutMapping("/user/user")
    public String updateUser(@RequestBody User user){
        String msg="Error";
        int num = userService.updateUser(user);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }
    @PostMapping("/user/user")
    public String insertUser(User user){
        String msg="Erroe";
        int num = userService.addUser(user);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id){
        String msg="Error";
        int num = userService.deleteUser(id);
        if(num >0){
            msg = "Success";
        }
        return msg;
    }


}

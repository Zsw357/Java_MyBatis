package com.example.java_mybatis.controller;

import com.example.java_mybatis.pojo.User;
import com.example.java_mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zsw
 * @create 2023-03-28 16:39
 */

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public List<User> getUserAll(){
        List<User> allUser = userService.findUserAll();
        return allUser;
    }
}

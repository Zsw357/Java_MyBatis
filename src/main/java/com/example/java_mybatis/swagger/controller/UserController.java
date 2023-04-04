package com.example.java_mybatis.swagger.controller;

import com.example.java_mybatis.pojo.User;
import com.example.java_mybatis.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Zsw
 * &#064;create  2023-03-28 16:39
 */
@SuppressWarnings("all")//抑制警告
@Api(tags = "用户接口")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;
    @ApiOperation(value = "查询全部用户信息")
    @RequestMapping(value = "/user",method = {RequestMethod.GET,RequestMethod.POST})
    public List<User> getUserAll(){
        return userService.findUserAll();
    }
    @ApiOperation(value = "通过ID查询用户信息")
    @RequestMapping(value = "/userById",method = {RequestMethod.GET,RequestMethod.POST})
    public List<User> getUserById(int id){
        return userService.findUserById(id);
    }
    @ApiOperation(value = "新增用户信息")
    @RequestMapping(value = "/userInsert",method = {RequestMethod.GET,RequestMethod.POST})
    public int userInsert(User user){
        return userService.userInsert(user);
    }
    @ApiOperation(value = "lambda练习")
    @RequestMapping(value = "/lmd")
    public int lmd(){
        return userService.lmd();
    }
}

package com.example.java_mybatis.service.impl;

import com.example.java_mybatis.mapper.IUser;
import com.example.java_mybatis.pojo.User;
import com.example.java_mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zsw
 * @create 2023-03-28 16:14
 */

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUser userMapper;
    @Override
    public List<User> findUserAll(){
        List<User> allUser = userMapper.findUserAll();
        return allUser;
    }
}

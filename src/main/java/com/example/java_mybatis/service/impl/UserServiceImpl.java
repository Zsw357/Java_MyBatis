package com.example.java_mybatis.service.impl;

import com.example.java_mybatis.mapper.IUser;
import com.example.java_mybatis.pojo.User;
import com.example.java_mybatis.service.IUserService;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.IntBinaryOperator;

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
        return userMapper.findUserAll();
    }

    @Override
    public List<User> findUserById(int id){
        return userMapper.findUserById(id);
    }
    @Override
    public int userInsert(User user){
        return userMapper.userInsert(user);
    }


    @Override
    public int lmd(){
        return calculateString(Integer::sum);
    }
    public int bbb(){
        return calculateString((int left, int right)->{
            return left+right;
        });
    }

    public  int aaa(){
        int i = calculateString(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left+right;
            }
        });
        return  i;
    }

    public static int calculateString(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }

}

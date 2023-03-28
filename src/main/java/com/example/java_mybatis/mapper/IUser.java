package com.example.java_mybatis.mapper;

import com.example.java_mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Zsw
 * @create 2023-03-28 16:08
 */

@Mapper
public interface IUser {
    List<User> findUserAll();
}

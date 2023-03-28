package com.example.java_mybatis.service;


import com.example.java_mybatis.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zsw
 * @create 2023-03-28 16:13
 */


public interface IUserService {
    List<User> findUserAll();
}

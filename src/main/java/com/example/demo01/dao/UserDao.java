package com.example.demo01.dao;

import com.example.demo01.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    User selectUser(Integer id);
    List<User> searchUser();
    User addUser(User user);
}

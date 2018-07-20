package com.example.demo01.service;

import com.example.demo01.dao.UserDao;
import com.example.demo01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserDao userDao;

    @Override
    public User selectUser(Integer id) {
        return userDao.selectUser(id);
    }

    @Override
    public List<User> searchUser() {
        return userDao.searchUser();

    }
    @Override
    public User addUser(User user){
        return userDao.addUser(user);
    }
}


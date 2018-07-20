package com.example.demo01.service;
import com.example.demo01.model.User;

import java.util.List;

public interface UserService {
    public User selectUser(Integer id);
    public List<User> searchUser();
    public User addUser(User user);
}

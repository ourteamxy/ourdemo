package com.example.demo01.controller;

import com.example.demo01.model.User;
import com.example.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser/{id}")
    public User selectUser(@PathVariable String id) {
        int idnum = Integer.parseInt(id);
        return userService.selectUser(idnum);
    }
    @ResponseBody
    @RequestMapping(value = "/searchUser", method = RequestMethod.GET)
    public List<User> searchUser() {
        List<User> list = userService.searchUser();
        System.out.println(list.toString());
        return list;
    }
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User addUser(User user) {
        User user1 = userService.addUser(user);
        userService.searchUser();
        return user1;
    }



}

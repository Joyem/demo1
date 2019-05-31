package com.example.demo.UserService;

import com.example.demo.UserDao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    public UserDao userDao;

    public String login(String username,String password){
        return userDao.login(username,password);
    }
}

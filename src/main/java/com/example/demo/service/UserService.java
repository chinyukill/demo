package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User sel(int id){
        return userMapper.sel(id);
    }
}

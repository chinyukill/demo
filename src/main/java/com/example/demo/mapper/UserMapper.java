package com.example.demo.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserMapper {
    User sel(int id);
}

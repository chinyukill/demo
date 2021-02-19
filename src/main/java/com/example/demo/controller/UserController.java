package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping(UserController.BOUN_URL)
public class UserController {
    public static final String BOUN_URL = "/testuser";

    @Autowired
    private UserService userService;

    @ResponseBody
    @ApiOperation(value = "新增用户")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK", response = User.class) })
    @GetMapping(value = "/get/{id}")
    public String getUser(@PathVariable int id) {
        return userService.sel(id).toString();
    }
}

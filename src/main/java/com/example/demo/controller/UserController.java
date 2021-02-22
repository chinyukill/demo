package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 
 * @ClassName: UserController
 * @Description: 链接数据库TEST
 * @author chinyuki
 * @date 2021/02/20
 *
 */
@RestController
@RequestMapping(UserController.BOUN_URL)
public class UserController {
    public static final String BOUN_URL = "/testuser";

    @Autowired
    private UserService userService;

    @ResponseBody
    @ApiOperation(value = "根据ID查询用户")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK", response = User.class) })
    @GetMapping(value = "/get/{id}")
    public String getUser(@PathVariable int id) {
        User user= userService.sel(id);
        
        return user.toString();
    }
}

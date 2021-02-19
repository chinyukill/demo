package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "com.example.demo.entity.User", description = "新增用户参数")
public class User {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "userName")
    private String userName;
    @ApiModelProperty(value = "passWord")
    private String passWord;
    @ApiModelProperty(value = "realName")
    private String realName;

}

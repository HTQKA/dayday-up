package com.xysimj.controller;

import com.xysimj.entity.User;
import io.swagger.annotations.Api;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xysimj.service.impl.UserService;

import java.util.List;

@Api("用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}

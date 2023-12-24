package com.xysimj.service.impl;

import com.xysimj.entity.User;
import io.swagger.annotations.ApiOperation;
import jakarta.annotation.Resource;
import com.xysimj.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ApiOperation("用户api")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper mapper;

    public List<User> getUsers() {

        return mapper.selectList(null);
    }
}

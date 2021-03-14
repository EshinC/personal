package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author 正
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> selectUsers() {
        return userMapper.selectUsers();
    }

    @Override
    public boolean saveUser(User user) {
        boolean isSuccess;
        if(ObjectUtils.isEmpty(user.getId())){
            isSuccess = userMapper.addUser(user);
        }else{
            isSuccess = userMapper.updateUser(user);
        }
        return isSuccess;
    }

    @Override
    public boolean deleteUser(String id) {
        return userMapper.deleteUser(id);
    }
}
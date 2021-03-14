package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;
import java.util.UUID;

/**
 * @author 正
 */
public interface UserService {
    /**
     * 查询所有用户详情
     * @return 返回所有用户详情
     */
    List<User> selectUsers();

    /**
     * 修改用户信息
     * @param user user
     * @return 修改状态
     */
    boolean saveUser(User user);

    /**
     * 删除用户信息
     * @param id id
     * @return 删除状态
     */
    boolean deleteUser(String id);
}

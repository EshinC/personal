package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author 正
 */
@Mapper
@Repository
public interface UserMapper {
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
    boolean updateUser(User user);

    /**
     * 删除用户信息
     * @param id id
     * @return 删除状态
     */
    boolean deleteUser(String id);

    /**
     * 新增用户信息
     * @param user user
     * @return 新增状态
     */
    boolean addUser(User user);
}

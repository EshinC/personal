package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


/**
 * @author 正
 */
@RestController
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/selectUsers")
    public List<User> selectUsers() {
        return userService.selectUsers();
    }

    @PostMapping("/saveUser")
    public boolean saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/deleteUser")
    public boolean deleteUser(@RequestBody String id){
        return userService.deleteUser(id);
    }
}

package com.atguigu.ecomm.ecomm.user.controller;

import com.atguigu.ecomm.ecomm.user.bean.UserInfo;
import com.atguigu.ecomm.ecomm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("allUsers")
    public List<UserInfo> getAllUser() {
        return userService.getUserInfoListAll();
    }
    @GetMapping("getUser")
    public UserInfo getAllUser(String id) {
        return userService.getUserInfoById(id);
    }

    @PostMapping("addUser")
    public String addUser(UserInfo user) {
        userService.addUser(user);
        return "success";
    }

    @PostMapping("updateUser")
    public String updateUser(UserInfo userInfo) {
        userService.updateUser(userInfo);
        return "success";
    }

    @PostMapping("updateUserByName")
    public String updateUserByName(UserInfo userInfo) {
        userService.updateUserByName(userInfo.getName(), userInfo);
        return "success";
    }

    @DeleteMapping("deleteUser")
    public String deleteUser(UserInfo userInfo) {
        userService.delUser(userInfo);
        return "success";
    }


}

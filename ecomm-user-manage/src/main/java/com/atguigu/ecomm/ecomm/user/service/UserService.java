package com.atguigu.ecomm.ecomm.user.service;

import com.atguigu.ecomm.ecomm.user.bean.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);

    UserInfo getUserInfoById(String id);
}

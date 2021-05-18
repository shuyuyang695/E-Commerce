package com.atguigu.ecomm.ecomm.user.service.impl;

import com.atguigu.ecomm.ecomm.user.bean.UserInfo;
import com.atguigu.ecomm.ecomm.user.repo.UserRepo;
import com.atguigu.ecomm.ecomm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;
    @Override
    public List<UserInfo> getUserInfoListAll() {
        List<UserInfo> userInfoList = userRepo.selectAll();
        return userInfoList;
    }

    @Override
    public void addUser(UserInfo userInfo) {

        userRepo.insertSelective(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {

        userRepo.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {

        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name", name);
        userRepo.updateByExampleSelective(userInfo, example);
    }

    @Override
    public void delUser(UserInfo userInfo) {

        userRepo.deleteByPrimaryKey(userInfo.getId());
    }

    @Override
    public UserInfo getUserInfoById(String id) {
        return userRepo.selectByPrimaryKey(id);
    }
}

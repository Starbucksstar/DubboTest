package com.star.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.star.user.service.UserService;

@Service(version = "1.0.0",group = "star")
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(int i) {
        return "star"+i;
    }

    @Override
    public Integer getUserAge(String s) {
        return 24;
    }

    @Override
    public String getUserPlace(int i) {
        return "湖北武汉";
    }
}

package com.star.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.star.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference(version = "1.0.0",group = "star")
    private UserService userService;

    @RequestMapping(value = "/info")
    public String test(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(userService.getUserAge("aa"));
        stringBuilder.append(userService.getUserName(1));
        stringBuilder.append(userService.getUserPlace(1));
        return JSON.toJSONString(stringBuilder.toString());
    }


}

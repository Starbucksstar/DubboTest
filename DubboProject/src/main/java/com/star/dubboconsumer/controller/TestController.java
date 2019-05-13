package com.star.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.star.api.model.UserKey;
import com.star.api.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "/select")
    public String test(@RequestParam Long id){

        UserKey userKey = new UserKey();
        userKey.setId(id);
        return JSON.toJSONString(userService.queryUser(userKey).toString());
    }


}

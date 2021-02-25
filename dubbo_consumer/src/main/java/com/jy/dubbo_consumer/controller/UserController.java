package com.jy.dubbo_consumer.controller;

import com.jy.dubbo_api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/user/getName/{id}")
    public String getName(@PathVariable("id")String id){
        return userService.getUserName(id);
    }
}

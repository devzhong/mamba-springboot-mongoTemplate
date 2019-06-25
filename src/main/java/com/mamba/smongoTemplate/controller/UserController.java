package com.mamba.smongoTemplate.controller;

import com.mamba.smongoTemplate.entity.User;
import com.mamba.smongoTemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author:devzhong
 * Date:2019/6/25 15:14
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
        return userService.saveObj(user);
    }
}

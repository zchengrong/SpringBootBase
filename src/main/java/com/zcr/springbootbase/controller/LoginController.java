package com.zcr.springbootbase.controller;

import com.zcr.springbootbase.domain.ResponseResult;
import com.zcr.springbootbase.domain.User;
import com.zcr.springbootbase.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aida
 * @version 1.0
 * @project SpringbootBase
 * @description 登录接口控制器
 * @date 2023/6/30 16:21:45
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user) {
        System.out.println(user);
        return loginService.login(user);
    }

    @PostMapping("/user/logout")
    public ResponseResult logout() {
        return loginService.logout();

    }
}

package com.springdev.blogapi.controller;

import com.springdev.blogapi.service.LoginService;
import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chen
 * @create 2022/2/16 21:11
 */
@RestController
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result register(@RequestBody LoginParam loginParam) {
        //sso 单点登录，后期如果把登陆注册功能 踢出去（单独的服务，可以独立提供接口服务）
        return loginService.register(loginParam);
    }
}

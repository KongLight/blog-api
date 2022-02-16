package com.springdev.blogapi.controller;

import com.springdev.blogapi.service.LoginService;
import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.params.LoginParam;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chen
 * @create 2022/2/16 17:09
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam) {
        //登录 验证用户 访问用户表，但是
        return loginService.login(loginParam);
    }
}

package com.springdev.blogapi.controller;

import com.springdev.blogapi.service.LoginService;
import com.springdev.blogapi.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Chen
 * @create 2022/2/16 21:06
 */
@RestController
@RequestMapping("logout")
public class LogoutController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public Result logout(@RequestHeader("Authorization") String token) {
        return loginService.logout(token);
    }
}

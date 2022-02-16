package com.springdev.blogapi.controller;

import com.springdev.blogapi.dao.pojo.SysUser;
import com.springdev.blogapi.utils.UserThreadLocal;
import com.springdev.blogapi.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
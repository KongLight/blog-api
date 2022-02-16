package com.springdev.blogapi.service;

import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.params.LoginParam;

/**
 * @Author Chen
 * @create 2022/2/16 17:12
 */
public interface LoginService {
    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    public Result login(LoginParam loginParam);
}
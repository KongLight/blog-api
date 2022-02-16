package com.springdev.blogapi.service;

import com.springdev.blogapi.dao.pojo.SysUser;
import com.springdev.blogapi.vo.Result;

/**
 * @Author Chen
 * @create 2022/2/14 23:19
 */
public interface SysUserService {

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);
}

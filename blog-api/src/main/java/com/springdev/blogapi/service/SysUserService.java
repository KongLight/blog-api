package com.springdev.blogapi.service;

import com.springdev.blogapi.dao.pojo.SysUser;

/**
 * @Author Chen
 * @create 2022/2/14 23:19
 */
public interface SysUserService {

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);
}

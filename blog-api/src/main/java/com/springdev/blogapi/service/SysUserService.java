package com.springdev.blogapi.service;

import com.springdev.blogapi.dao.pojo.SysUser;
import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.UserVo;

/**
 * @Author Chen
 * @create 2022/2/14 23:19
 */
public interface SysUserService {

    UserVo findUserVoById(Long id);

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 根据账户查找用户
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    /**
     * 保存用户
     * @param sysUser
     */
    void save(SysUser sysUser);
}

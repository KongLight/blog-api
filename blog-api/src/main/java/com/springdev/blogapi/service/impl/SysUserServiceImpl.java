package com.springdev.blogapi.service.impl;

import com.springdev.blogapi.dao.mapper.SysUserMapper;
import com.springdev.blogapi.dao.pojo.SysUser;
import com.springdev.blogapi.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Chen
 * @create 2022/2/14 23:20
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("空明白");
        }
        return sysUser;
    }
}
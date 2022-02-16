package com.springdev.blogapi.utils;

import com.springdev.blogapi.dao.pojo.SysUser;

/**
 * @Author Chen
 * @create 2022/2/16 22:04
 */
public class UserThreadLocal {

    private UserThreadLocal(){}
    //线程变量隔离
    private static final ThreadLocal<SysUser> LOCAL = new ThreadLocal<>();

    public static void put(SysUser sysUser) {
        LOCAL.set(sysUser);
    }

    public static SysUser get() {
        return LOCAL.get();
    }

    public static void remove() {
        LOCAL.remove();
    }
}

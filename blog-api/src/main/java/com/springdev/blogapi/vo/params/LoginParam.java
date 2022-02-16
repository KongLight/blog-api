package com.springdev.blogapi.vo.params;

import lombok.Data;

/**
 * @Author Chen
 * @create 2022/2/16 17:13
 */
@Data
public class LoginParam {

    private String account;

    private String password;

    private String nickname;
}

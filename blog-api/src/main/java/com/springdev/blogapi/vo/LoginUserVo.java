package com.springdev.blogapi.vo;

import lombok.Data;

/**
 * @Author Chen
 * @create 2022/2/16 20:55
 */
@Data
public class LoginUserVo {

    private Long id;

    private String account;

    private String nickname;

    private String avatar;
}

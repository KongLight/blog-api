package com.springdev.blogapi.dao.dos;

import lombok.Data;

/**
 * @Author Chen
 * @create 2022/2/16 16:13
 */
@Data
public class Archives {

    private Integer year;

    private Integer month;

    private Long count;
}

package com.springdev.blogapi.vo.params;

import lombok.Data;

/**
 * @Author Chen
 * @create 2022/2/14 22:26
 */
@Data
public class PageParams {

    private int page = 1;

    private int pageSize = 10;
}

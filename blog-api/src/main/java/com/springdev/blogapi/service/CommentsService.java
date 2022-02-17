package com.springdev.blogapi.service;

import com.springdev.blogapi.vo.Result;

/**
 * @Author Chen
 * @create 2022/2/17 20:38
 */
public interface CommentsService {

    /**
     * 根据文章id查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);
}

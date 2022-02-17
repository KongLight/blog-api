package com.springdev.blogapi.service;

import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.TagVo;

import java.util.List;

/**
 * @Author Chen
 * @create 2022/2/14 23:03
 */
public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    /**
     * 查询所有的文章标签
     * @return
     */
    Result findAll();
}

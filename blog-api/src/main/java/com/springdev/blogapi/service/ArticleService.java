package com.springdev.blogapi.service;

import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.params.PageParams;

/**
 * @Author Chen
 * @create 2022/2/14 22:32
 */
public interface ArticleService {

    /**
     * 分页查询 文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 最新文章
     * @param limit
     * @return
     */
    Result newArticles(int limit);
}

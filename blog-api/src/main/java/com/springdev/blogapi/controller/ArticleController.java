package com.springdev.blogapi.controller;

import com.springdev.blogapi.common.aop.LogAnnotation;
import com.springdev.blogapi.dao.mapper.ArticleMapper;
import com.springdev.blogapi.service.ArticleService;
import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.params.ArticleParam;
import com.springdev.blogapi.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Chen
 * @create 2022/2/14 22:25
 */
//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
    /**
     * 首页 文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    //加上此注解，代表要对此接口记录日志
    @LogAnnotation(module="文章",  operator="获取文章列表")
    public Result listArticle(@RequestBody PageParams pageParams){
//        int i = 10/0;
        return articleService.listArticle(pageParams);
    }

    /**
     * 首页 最热文章
     * @return
     */
    @PostMapping("hot")
    public Result hotArticle(){
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /**
     * 首页 最新文章
     * @return
     */
    @PostMapping("new")
    public Result newArticles(){
        int limit = 5;
        return articleService.newArticles(limit);
    }

    /**
     * 首页 文章归档
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId) {
        return articleService.findArticleById(articleId);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam) {
        return articleService.publish(articleParam);
    }
}

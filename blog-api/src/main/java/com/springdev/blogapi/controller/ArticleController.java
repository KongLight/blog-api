package com.springdev.blogapi.controller;

import com.springdev.blogapi.dao.mapper.ArticleMapper;
import com.springdev.blogapi.service.ArticleService;
import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result listArticle(@RequestBody PageParams pageParams){
        return articleService.listArticle(pageParams);
    }
}

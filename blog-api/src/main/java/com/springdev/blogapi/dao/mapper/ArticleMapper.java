package com.springdev.blogapi.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springdev.blogapi.dao.dos.Archives;
import com.springdev.blogapi.dao.pojo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Chen
 * @create 2022/2/14 22:22
 */
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();
}

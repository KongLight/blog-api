package com.springdev.blogapi.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springdev.blogapi.dao.pojo.ArticleBody;
import com.springdev.blogapi.dao.pojo.Category;
import org.springframework.stereotype.Repository;

/**
 * @Author Chen
 * @create 2022/2/17 16:25
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {
}

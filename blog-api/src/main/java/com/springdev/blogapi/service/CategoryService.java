package com.springdev.blogapi.service;

import com.springdev.blogapi.vo.CategoryVo;

import java.util.List;

/**
 * @Author Chen
 * @create 2022/2/17 16:29
 */
public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);
}

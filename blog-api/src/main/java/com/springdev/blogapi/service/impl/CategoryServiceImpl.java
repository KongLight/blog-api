package com.springdev.blogapi.service.impl;

import com.springdev.blogapi.dao.mapper.CategoryMapper;
import com.springdev.blogapi.dao.pojo.Category;
import com.springdev.blogapi.service.CategoryService;
import com.springdev.blogapi.vo.CategoryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Chen
 * @create 2022/2/17 16:29
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public CategoryVo findCategoryById(Long categoryId) {
        Category category = categoryMapper.selectById(categoryId);
        CategoryVo categoryVo = new CategoryVo();
        BeanUtils.copyProperties(category, categoryVo);
        return categoryVo;
    }
}

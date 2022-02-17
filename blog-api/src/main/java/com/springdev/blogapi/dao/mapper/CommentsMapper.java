package com.springdev.blogapi.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springdev.blogapi.dao.pojo.Comment;
import org.springframework.stereotype.Repository;

/**
 * @Author Chen
 * @create 2022/2/17 20:40
 */
@Repository
public interface CommentsMapper extends BaseMapper<Comment> {
}

package com.springdev.blogapi.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springdev.blogapi.dao.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Chen
 * @create 2022/2/14 22:24
 */
@Repository
public interface TagMapper extends BaseMapper<Tag> {
    /**
     *根据文章id查询标签列表
     */
    List<Tag> findTagsByArticleId(Long articleId);

    /**
     * 查询最热的标签 前n条
     * @param limit
     * @return
     */
    List<Long> findHostsTagIds(int limit);

    List<Tag> findTagsByTagIds(List<Long> tagIds);
}

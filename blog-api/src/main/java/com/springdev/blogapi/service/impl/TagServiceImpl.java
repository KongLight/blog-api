package com.springdev.blogapi.service.impl;

import com.springdev.blogapi.dao.mapper.TagMapper;
import com.springdev.blogapi.dao.pojo.Tag;
import com.springdev.blogapi.service.TagService;
import com.springdev.blogapi.vo.Result;
import com.springdev.blogapi.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Chen
 * @create 2022/2/14 23:05
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<TagVo> findTagsByArticleId(Long articleId) {
        //mybatisplus 无法进行多表查询
        List<Tag> tagList = tagMapper.findTagsByArticleId(articleId);
        return copyList(tagList);
    }

    private List<TagVo> copyList(List<Tag> tagList) {
        List<TagVo> tagVoList = new ArrayList<>();
        for (Tag tag : tagList) {
            tagVoList.add(copy(tag));
        }
        return tagVoList;

    }

    private TagVo copy(Tag tag) {
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag, tagVo);
        return tagVo;
    }

    @Override
    public Result hots(int limit) {
        /**
         * 1、标签所拥有的文章数最多 最热标签
         * 2、查询 根据tag_id 分组 计数，从大到小 排列 取前limit个
         */
        List<Long> tagIds = tagMapper.findHostsTagIds(limit);
        if (CollectionUtils.isEmpty(tagIds)) {
            return  Result.success(Collections.emptyList());
        }
        //需求的是 tagId 和 tagName  Tag对象
        // select * from tag where id in ()
        List<Tag> tagList = tagMapper.findTagsByTagIds(tagIds);
        return Result.success(tagList);
    }
}

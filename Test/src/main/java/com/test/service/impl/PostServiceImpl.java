package com.test.service.impl;

import com.test.entity.PostEntity;
import com.test.mapper.PostMapper;
import com.test.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;

    /**
     * 查看所有岗位
     * @return 岗位信息
     */
    public List<PostEntity> getList() {
        return postMapper.postList();
    }
}

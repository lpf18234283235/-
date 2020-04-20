package com.test.mapper;

import com.test.entity.PostEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostMapper {
    /**
     * 查看所有岗位
     * @return 岗位信息
     */
    List<PostEntity> postList();
}

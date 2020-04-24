package com.test.service;

import com.test.entity.FreemanEntity;
import java.util.List;

public interface FreemanService {
    FreemanEntity selectById(Integer userId);

    List<FreemanEntity> selectList();

    void insert(FreemanEntity freemanEntity, String openId);

    void update(FreemanEntity freemanEntity,String openId);

    int deleteByIds(Integer[] userIds);

    int deleteById(Integer userId);

    void updateStatus(String openId,Integer status);
}

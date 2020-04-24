package com.test.mapper;

import com.test.entity.ScoreInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreInfoMapper {
    /**
     * 获取所有积分说明
     * @return
     */
    List<ScoreInfoEntity> getInfo();

    /**
     * 通过说明id查找积分数值
     * @param id 说明id
     * @return 积分数值
     */
    Integer getScoreById(Integer id);
}

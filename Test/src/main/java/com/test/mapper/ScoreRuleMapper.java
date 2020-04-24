package com.test.mapper;

import com.test.entity.ScoreRuleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRuleMapper {
    /**
     * 查看所有积分规则
     * @return
     */
    List<ScoreRuleEntity> getAll();
}

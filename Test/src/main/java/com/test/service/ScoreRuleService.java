package com.test.service;

import com.test.entity.ScoreRuleEntity;

import java.util.List;

public interface ScoreRuleService {
    /**
     * 查看所有积分规则
     * @return
     */
    List<ScoreRuleEntity> allList();
}

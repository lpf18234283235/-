package com.test.service.impl;

import com.test.entity.ScoreRuleEntity;
import com.test.mapper.ScoreRuleMapper;
import com.test.service.ScoreRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreRuleServiceImpl implements ScoreRuleService {
    @Autowired
    private ScoreRuleMapper scoreRuleMapper;
    @Override
    public List<ScoreRuleEntity> allList() {
        return scoreRuleMapper.getAll();
    }
}

package com.test.service.impl;

import com.test.entity.ScoreMinValueEntity;
import com.test.mapper.ScoreMinValueMapper;
import com.test.service.ScoreDetailService;
import com.test.service.ScoreMinValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreMinValueServiceImpl implements ScoreMinValueService {
    @Autowired
    private ScoreMinValueMapper scoreMinValueMapper;

    @Override
    public Integer getMinValue() {
        return scoreMinValueMapper.minScore();
    }
}

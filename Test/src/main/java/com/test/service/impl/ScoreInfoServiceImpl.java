package com.test.service.impl;

import com.test.entity.ScoreInfoEntity;
import com.test.mapper.ScoreInfoMapper;
import com.test.mapper.ScoreMapper;
import com.test.service.ScoreInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoreInfoServiceImpl implements ScoreInfoService {
    @Autowired
    private ScoreInfoMapper scoreInfoMapper;

    public List<ScoreInfoEntity> getList() {
        return scoreInfoMapper.getInfo();
    }


    public Integer getScoreById(Integer id) {
        return scoreInfoMapper.getScoreById(id);
    }
}

package com.test.service;

import com.test.entity.ScoreDetailEntity;
import java.util.List;

public interface ScoreDetailService {
    List<ScoreDetailEntity> findById(String openId);

    Integer countScore(String openId);

    void createScoreDetail(ScoreDetailEntity scoreDetailEntity,String openId);
}

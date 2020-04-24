package com.test.service;

import com.test.entity.ScoreInfoEntity;

import java.util.List;

public interface ScoreInfoService {

    List<ScoreInfoEntity> getList();

    Integer getScoreById(Integer id);
}

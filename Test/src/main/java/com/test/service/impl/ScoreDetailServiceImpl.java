package com.test.service.impl;

import com.test.entity.ScoreDetailEntity;
import com.test.mapper.ScoreDetailMapper;
import com.test.service.MainService;
import com.test.service.ScoreDetailService;
import com.test.service.impl.ScoreDetailServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreDetailServiceImpl
        implements ScoreDetailService {
    @Autowired
    private MainService mainService;
    @Autowired
    private ScoreDetailMapper scoreVOMapper;

    public List<ScoreDetailEntity> findById(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);

        return this.scoreVOMapper.findScoreById(userId);
    }




    public Integer countScore(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        return this.scoreVOMapper.countScoreValue(userId);
    }
}

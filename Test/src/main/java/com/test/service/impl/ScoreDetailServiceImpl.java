package com.test.service.impl;

import com.test.entity.ScoreDetailEntity;
import com.test.mapper.ScoreDetailMapper;
import com.test.service.MainService;
import com.test.service.ScoreDetailService;
import com.test.service.impl.ScoreDetailServiceImpl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreDetailServiceImpl
        implements ScoreDetailService {
    @Autowired
    private MainService mainService;
    @Autowired
    private ScoreDetailMapper scoreDetailMapper;

    public List<ScoreDetailEntity> findById(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);

        return this.scoreDetailMapper.findScoreById(userId);
    }




    public Integer countScore(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        return this.scoreDetailMapper.countScoreValue(userId);
    }

    /**
     * 添加积分细节
     * @param scoreDetailEntity 积分实体对象
     * @return
     */
    public void createScoreDetail(ScoreDetailEntity scoreDetailEntity,String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        scoreDetailEntity.setUserId(userId);
        scoreDetailEntity.setUpdateBy(userId);
        scoreDetailEntity.setUpdateDate(new Date());
        scoreDetailMapper.addScoreDetail(scoreDetailEntity);
    }
}

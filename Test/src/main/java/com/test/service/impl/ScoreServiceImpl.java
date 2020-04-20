package  com.test.service.impl;

import com.test.mapper.ScoreMapper;
import com.test.service.MainService;
import com.test.service.ScoreDetailService;
import com.test.service.ScoreService;
import com.test.service.impl.ScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class ScoreServiceImpl
        implements ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private MainService mainService;
    @Autowired
    private ScoreDetailService scoreDetailService;

    public void updateScoreValue(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        Integer score = this.scoreDetailService.countScore(openId);
        this.scoreMapper.changeValue(score, userId);
    }
}

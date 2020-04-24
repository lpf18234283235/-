package com.test.mapper;

import com.test.entity.ScoreDetailEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDetailMapper {
    List<ScoreDetailEntity> findScoreById(Integer userId);

    Integer countScoreValue(Integer userId);

    /**
     * 添加积分细节
     * @param scoreDetailEntity 积分实体对象
     * @return 是否成功
     */
    Integer addScoreDetail(ScoreDetailEntity scoreDetailEntity);
}

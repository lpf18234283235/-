package com.test.mapper;

import com.test.entity.ScoreDetailEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreDetailMapper {
    List<ScoreDetailEntity> findScoreById(Integer userId);

    Integer countScoreValue(Integer userId);
}

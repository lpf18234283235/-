package com.test.mapper;

import com.test.entity.ScoreMinValueEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreMinValueMapper {
    /**
     * 查看积分兑换门槛
     * @return
     */
    Integer minScore();
}

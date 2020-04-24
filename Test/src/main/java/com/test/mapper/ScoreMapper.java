package  com.test.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface ScoreMapper {
    Integer changeValue(Integer scoreValue,Integer userId);

    /**
     * 查看个人用户的积分总额
     * @param userId
     * @return
     */
     Integer getScoreValue(Integer userId);
}

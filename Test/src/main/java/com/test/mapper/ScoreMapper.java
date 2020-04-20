package  com.test.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface ScoreMapper {
    Integer changeValue(Integer scoreValue,Integer userId);
}

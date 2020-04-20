package com.test.mapper;

import com.test.entity.TeamEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMapper {
    TeamEntity selectById(Integer userId);

    List<TeamEntity> selectList();

    /**
     * 添加入驻自由人
     * @param teamEntity
     * @return
     */
    Integer addTeam(TeamEntity teamEntity);

    /**
     * 修改入驻自由人信息
     * @param teamEntity
     * @return
     */
    Integer updateTeam(TeamEntity teamEntity);

    Integer deleteById(Integer userId);

    Integer deleteByIds(Integer[] userIds);
}

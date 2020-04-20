package com.test.service;

import com.test.entity.TeamEntity;
import java.util.List;

public interface TeamService {
    TeamEntity selectById(Integer userId);

    List<TeamEntity> selectTeamList();

    void insertTeam(TeamEntity teamEntity, String openId);

    void updateTeam(TeamEntity teamEntity,String openId);

    int deleteTeamByIds(Integer[] userIds);

    int deleteTeamById(Integer userId);
}

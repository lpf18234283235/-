package com.test.service.impl;

import com.test.entity.MainEntity;
import com.test.entity.TeamEntity;
import com.test.exception.UpdateException;
import com.test.mapper.TeamMapper;
import com.test.service.MainService;
import com.test.service.TeamService;
import com.test.service.impl.TeamServiceImpl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class TeamServiceImpl
		implements TeamService
{
	@Autowired
	TeamMapper teamMapper;
	@Autowired
	MainService mainService;

	public TeamEntity selectById(Integer userId) { return this.teamMapper.selectById(userId); }




	public List<TeamEntity> selectTeamList() { return this.teamMapper.selectList(); }



	@Transactional
	public void insertTeam(TeamEntity teamEntity, String openId) {
		Integer userId = this.mainService.findIdByOpenId(openId);
		System.out.println(openId);
		System.out.println(userId);
		teamEntity.setUserId(userId);
		this.teamMapper.addTeam(teamEntity);
		System.out.println(teamEntity);
		MainEntity mainEntity = new MainEntity();
		mainEntity.setUserImage(teamEntity.getUserImage());
		mainEntity.setUserType("2");
		mainEntity.setUserAddress(teamEntity.getAddress());
		mainEntity.setUserStatus("1");
		mainEntity.setMainId(userId);
		mainEntity.setInTime(new Date());
		this.mainService.replaceById(mainEntity);
	}


	public void updateTeam(TeamEntity teamEntity,String openId) {
		Integer userId=mainService.findIdByOpenId(openId);
		teamEntity.setUserId(userId);
		teamMapper.updateTeam(teamEntity);
	}



	public int deleteTeamByIds(Integer[] userIds) { return 0; }




	public int deleteTeamById(Integer userId) { return 0; }
}

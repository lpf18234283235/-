package com.test.service.impl;

import com.test.entity.NoticeEntity;
import com.test.mapper.NoticeMapper;
import com.test.service.MainService;
import com.test.service.NoticeService;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;






@Service
public class NoticeServiceImpl
		implements NoticeService
{
	@Autowired
	private NoticeMapper noticeMapper;
	@Autowired
	private MainService mainService;

	public List<NoticeEntity> getById(String openId) {
		Integer userId = this.mainService.findIdByOpenId(openId);
		return this.noticeMapper.findById(userId);
	}







	public Integer insert(NoticeEntity noticeEntity, String openId) {
		Integer inviteId = this.mainService.findIdByOpenId(openId);
		System.err.println(inviteId);
		noticeEntity.setInviteId(inviteId);
		noticeEntity.setInsertTime(new Date());
		return this.noticeMapper.addNotice(noticeEntity);
	}

	public void updataById(Integer noticeId) {
		Date date = new Date();
		String status = "1";
		this.noticeMapper.updataById(noticeId, status, date);
	}
}

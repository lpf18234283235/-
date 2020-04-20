package com.test.service;

import com.test.entity.NoticeEntity;
import java.util.List;

public interface NoticeService {
	List<NoticeEntity> getById(String openId);

	Integer insert(NoticeEntity noticeEntity, String openId);

	void updataById(Integer noticeId);
}

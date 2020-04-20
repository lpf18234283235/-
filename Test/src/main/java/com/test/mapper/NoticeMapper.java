package com.test.mapper;

import com.test.entity.NoticeEntity;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeMapper {
	Integer addNotice(NoticeEntity noticeEntity);

	List<NoticeEntity> findById(Integer userId);

	Integer updataById(Integer noticeId, String status, Date date);
}

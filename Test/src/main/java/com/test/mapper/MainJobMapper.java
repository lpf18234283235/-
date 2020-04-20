package com.test.mapper;

import com.test.entity.MainJobEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface MainJobMapper {
	List<MainJobEntity> findJobByName(String jobName);

	Integer findByJobName(String paramString1, String paramString2);
}

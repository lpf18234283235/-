package com.test.service;

import java.util.List;

import com.test.entity.MainJobEntity;

public interface MainJobService {
   
	List<MainJobEntity> findAllByJobName(String jobName);
}

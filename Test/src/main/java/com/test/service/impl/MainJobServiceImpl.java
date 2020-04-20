package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.MainJobEntity;
import com.test.mapper.MainJobMapper;
import com.test.service.MainJobService;

@Service
public class MainJobServiceImpl implements MainJobService{

	@Autowired
	MainJobMapper mainjobmapper;
	@Override
	public List<MainJobEntity> findAllByJobName(String jobName) {
		return mainjobmapper.findJobByName(jobName);
	}

}

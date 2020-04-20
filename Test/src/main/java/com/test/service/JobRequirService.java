package com.test.service;

import com.test.entity.JobRequirEntity;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface JobRequirService {
    List<JobRequirEntity> getJobByAddress(Integer code);

    void insertJobRequir(JobRequirEntity jobRequirEntity, String openId);

    List<JobRequirEntity> getListByOpenId(String openId);

    void changeJobRequir(JobRequirEntity jobRequirEntity, String openId);
}

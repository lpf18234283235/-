package com.test.service;

import com.test.entity.JobRequirEntity;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface JobRequirService {
    List<JobRequirEntity> getJobByAddress(Integer code);

    void insertJobRequir(JobRequirEntity jobRequirEntity, String openId);

    List<JobRequirEntity> getListByOpenId(String openId);

    void changeJobRequir(JobRequirEntity jobRequirEntity, String openId);

    JobRequirEntity getByRequirId(Integer requirId);

    /**
     * 根据状态查找用工需求
     * @param openId 当前登录用户
     * @param taskStatus 需求状态
     * @return 用工需求
     */
    List<JobRequirEntity> getListByStatus(String openId,Integer taskStatus);

    /**
     * 修改指定需求的状态
     * @param requirId 需求id
     * @param taskStatus 需求状态
     * @param openId 登录openId
     */
    void changeStatus(Integer requirId,String taskStatus,String openId);
}

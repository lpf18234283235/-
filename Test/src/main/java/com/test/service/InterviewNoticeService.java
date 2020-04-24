package com.test.service;

import com.test.entity.InterviewNoticeEntity;

import java.util.List;

public interface InterviewNoticeService {

    /**
     * 甲方的所有面试
     * @return
     */
    List<InterviewNoticeEntity> listByIdA(String openId);

    /**
     * 已方的所有面试
     * @return
     */
    List<InterviewNoticeEntity> listByIdB(String openId);

    /**
     * 甲方查看状态的面试
     * @return
     */
    List<InterviewNoticeEntity> listByStatusUserIdA(String openId,Integer interviewStatus);



    /**
     * 乙方查看状态不同的面试
     * @return
     */
    List<InterviewNoticeEntity> listByStatusUserIdB(String openId,Integer interviewStatus);

    /**
     * 创建面试邀请
     * @param interviewNoticeEntity 实体对象
     * @param openId 当前登录用户
     */
    void createInterview(InterviewNoticeEntity interviewNoticeEntity,String openId);

    /**
     * 修改面试邀请状态
     * @param id
     * @param interviewStatus
     */
    void changeStatus(Integer id,Integer interviewStatus);
}

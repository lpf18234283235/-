package com.test.mapper;

import com.test.entity.InterviewNoticeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InterviewNoticeMapper {
    /**
     * 甲方的所有面试
     * @return
     */
    List<InterviewNoticeEntity> listByIdA(Integer userIdA);

    /**
     * 已方的所有面试
     * @return
     */
    List<InterviewNoticeEntity> listByIdB(Integer userIdB);

    /**
     * 甲方查看状态的面试
     * @return
     */
    List<InterviewNoticeEntity> listByStatusUserIdA(Integer userIdA,Integer interviewStatus);



    /**
     * 乙方查看状态不同的面试
     * @return
     */
    List<InterviewNoticeEntity> listByStatusUserIdB(Integer userIdB,Integer interviewStatus);

    /**
     * 创建面试
     * @return
     */
    Integer addInterview(InterviewNoticeEntity interviewNoticeEntity);

    /**
     * 修改指定面试邀请的状态
     * @param id
     * @return
     */
    Integer updateStatus(Integer id,Integer interviewStatus);
}

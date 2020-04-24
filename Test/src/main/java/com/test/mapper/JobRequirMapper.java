package com.test.mapper;

import com.test.entity.JobRequirEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRequirMapper {
    /**
     * 通过地址编码查找用工需求
     * @param code 地址编码
     * @return 指定地址的所有用工需求
     */
    List<JobRequirEntity> findJobByCode(Integer code);

    /**
     * 创建用工需求
     * @param jobRequirEntity 用工需求实体对象
     * @return 是否成功
     */
    Integer addJobRequir(JobRequirEntity jobRequirEntity);

    /**
     * 查看当前登录公司的所有用工需求
     * @param userId 公司id
     * @return 全部用工需求
     */
    List<JobRequirEntity> findListByUserId(Integer userId);

    /**
     * 修改用工需求
     * @param jobRequirEntity 实体对象
     * @return 是否成功
     */
    Integer changeJobRequir(JobRequirEntity jobRequirEntity);

    /**
     * 查看用工需求详情
     * @param requirId 需求id
     * @return
     */
    JobRequirEntity getByRequirId(Integer requirId);

    /**
     * 根据需求状态查找
     * @param userId 用户的id
     * @param taskStatus 需求状态
     * @return 用工需求
     */
    List<JobRequirEntity> getListByStatus(Integer userId,Integer taskStatus);

    /**
     * 修改指定用工需求的状态
     * @param requirId 需求id
     * @param taskStatus 状态
     * @return
     */
    Integer updateStatus(Integer requirId,String taskStatus);
}

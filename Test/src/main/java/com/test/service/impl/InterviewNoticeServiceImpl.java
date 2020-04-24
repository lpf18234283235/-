package com.test.service.impl;

import com.test.entity.*;
import com.test.exception.CreateException;
import com.test.mapper.InterviewNoticeMapper;
import com.test.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewNoticeServiceImpl implements InterviewNoticeService {

    @Autowired
    private InterviewNoticeMapper interviewNoticeMapper;
    @Autowired
    private MainService mainService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private TeamService teamService;
    @Autowired
    private FreemanService freemanService;
    @Override
    public List<InterviewNoticeEntity> listByIdA(String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        return interviewNoticeMapper.listByIdA(userId);
    }

    @Override
    public List<InterviewNoticeEntity> listByIdB(String openId) {
        Integer userId=mainService.findIdByOpenId(openId);
        return interviewNoticeMapper.listByIdB(userId);
    }

    @Override
    /**
     * 甲方
     */
    public List<InterviewNoticeEntity> listByStatusUserIdA(String openId, Integer interviewStatus) {
        Integer userId=mainService.findIdByOpenId(openId);
        return interviewNoticeMapper.listByStatusUserIdA(userId,interviewStatus);
    }

    @Override
    /**
     * 乙方
     */
    public List<InterviewNoticeEntity> listByStatusUserIdB(String openId, Integer interviewStatus) {
        Integer userId=mainService.findIdByOpenId(openId);
        return interviewNoticeMapper.listByStatusUserIdB(userId,interviewStatus);
    }

    @Override
    public void createInterview(InterviewNoticeEntity interviewNoticeEntity, String openId) {
        MainEntity mainEntity =mainService.findMainByOpenId(openId);
        Integer id=mainEntity.getMainId();
        interviewNoticeEntity.setUserIdA(id);
        System.err.println(id);
        String type=mainEntity.getUserType();
        System.err.println(type);
        if(type.equals("1")){
            CompanyEntity companyEntity=companyService.selectById(id);
            String companyName=companyEntity.getName();
            interviewNoticeEntity.setUserAName(companyName);
            System.err.println(111);
        }else if(type.equals("2")){
            TeamEntity teamEntity=teamService.selectById(id);
            System.err.println(teamEntity);
            String teamName=teamEntity.getTeamName();
            System.err.println(teamName);
            interviewNoticeEntity.setUserAName(teamName);
            System.err.println(222);
        }else if(type.equals("3")){
            FreemanEntity freemanEntity=freemanService.selectById(id);
            String freeName=freemanEntity.getName();
            interviewNoticeEntity.setUserAName(freeName);
            System.err.println(333);
        }
        Integer idb=interviewNoticeEntity.getUserIdB();
        System.err.println(idb);
        MainEntity mainEntity1=mainService.findMainByMainId(idb);
        String type1=mainEntity1.getUserType();
        System.err.println(type1);
        if(type1.equals("2")){
            TeamEntity teamEntity=teamService.selectById(idb);
            interviewNoticeEntity.setUserBName(teamEntity.getTeamName());
            System.err.println(444);
        }else if(type1.equals("3")){
            FreemanEntity freemanEntity=freemanService.selectById(idb);
            interviewNoticeEntity.setUserBName(freemanEntity.getName());
            System.err.println(555);
        }
        interviewNoticeEntity.setInterviewStatus(0);
        Integer row=interviewNoticeMapper.addInterview(interviewNoticeEntity);
        if(row!=1){
            throw new CreateException("创建面试邀请失败");
        }
    }

    @Override
    public void changeStatus(Integer id, Integer interviewStatus) {
        interviewNoticeMapper.updateStatus(id,interviewStatus);
    }
}

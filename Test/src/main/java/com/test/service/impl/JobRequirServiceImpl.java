package  com.test.service.impl;

import com.test.entity.JobRequirEntity;
import com.test.entity.MainEntity;
import com.test.exception.UserNotFoundException;
import com.test.mapper.JobRequirMapper;
import com.test.service.JobRequirService;
import com.test.service.MainService;
import com.test.service.impl.JobRequirServiceImpl;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobRequirServiceImpl
        implements JobRequirService
{
    @Autowired
    private JobRequirMapper jobRequirMapper;
    @Autowired
    private MainService mainService;

    public List<JobRequirEntity> getJobByAddress(Integer code) { return this.jobRequirMapper.findJobByCode(code); }



    public void insertJobRequir(JobRequirEntity jobRequirEntity, String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        System.err.println(userId);
        jobRequirEntity.setCreateBy(userId).setUserId(userId).setTaskStatus("0");
        this.jobRequirMapper.addJobRequir(jobRequirEntity);
    }


    public List<JobRequirEntity> getListByOpenId(String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        return jobRequirMapper.findListByUserId(userId);
    }


    public void changeJobRequir(JobRequirEntity jobRequirEntity, String openId) {
        Integer userId = this.mainService.findIdByOpenId(openId);
        jobRequirEntity.setUserId(userId);
        jobRequirMapper.changeJobRequir(jobRequirEntity);
    }


    public JobRequirEntity getByRequirId(Integer requirId) {
        return jobRequirMapper.getByRequirId(requirId);
    }

    @Override
    public List<JobRequirEntity> getListByStatus(String openId, Integer taskStatus) {
        Integer userId=mainService.findIdByOpenId(openId);
        return jobRequirMapper.getListByStatus(userId,taskStatus);
    }


    public void changeStatus(Integer requirId, String taskStatus, String openId) {
        MainEntity m=mainService.findMainByOpenId(openId);
        if(m==null){
            throw new UserNotFoundException("用户信息异常");
        }
        jobRequirMapper.updateStatus(requirId,taskStatus);
    }


}

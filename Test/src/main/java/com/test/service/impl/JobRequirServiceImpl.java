package  com.test.service.impl;

import com.test.entity.JobRequirEntity;
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
        jobRequirEntity.setCreateBy(userId).setUserId(userId).setTaskStatus("0").setCreateTime(new Date());
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


}

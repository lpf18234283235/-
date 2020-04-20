package com.test.mapper;

import com.test.entity.MainEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface MainMapper {
    MainEntity selectById(Integer mainId);

    List<MainEntity> selectList();

    Integer insertMain(MainEntity mainEntity);

    Integer deleteById(Integer userId);

    Integer deleteByIds(Integer[] userIds);

    Integer getIdByOpenId(String openId);

    void replaceMain(MainEntity mainEntity);

    String getUsernameByOpenId(String openId);

    String getStatusByOpenId(String openId);

    String getTypeByOpenId(String openId);

    MainEntity getMainByOpenId(String openId);

    Integer updateStataus(Integer mainId);
}

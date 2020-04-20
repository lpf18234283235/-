package com.test.service;

import com.test.entity.CompanyEntity;
import java.util.ArrayList;
import java.util.List;

public interface CompanyService {
    CompanyEntity selectById(Integer userId);

    List<CompanyEntity> selectList();

    void insert(CompanyEntity companyEntity, String openId);

    void update(CompanyEntity companyEntity, String openId);

    int deleteByIds(Integer[] userIds);

    int deleteById(Integer userId);

    List<CompanyEntity> selectListByIds(ArrayList[] userIds);
}

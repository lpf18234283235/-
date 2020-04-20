package com.test.service.impl;

import com.test.entity.DistrictEntity;
import com.test.mapper.DistrictMapper;
import com.test.service.DistrictService;
import com.test.service.impl.DistrictServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;


    public List<DistrictEntity> getByParent(String parent) {
        List<DistrictEntity> districts=districtMapper.findByParent(parent);
        return districts;
    }

    @Override
    public DistrictEntity getByCode(String code) {
        return districtMapper.findByCode(code);
    }
    }

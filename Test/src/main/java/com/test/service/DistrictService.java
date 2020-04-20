package com.test.service;

import com.test.entity.DistrictEntity;
import java.util.List;

/**
 * 查询地址信息的业务层接口
 * @author soft01
 */
public interface DistrictService {


    List<DistrictEntity> getByParent(String parent);


    DistrictEntity getByCode(String code);
}

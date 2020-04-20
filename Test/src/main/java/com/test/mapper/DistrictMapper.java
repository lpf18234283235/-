package com.test.mapper;

import com.test.entity.DistrictEntity;
import org.springframework.stereotype.Repository;

import java.util.List;



/**
 * 获取地址信息的持久层接口
 * @author soft01
 */
@Repository
public interface DistrictMapper {

    /**
     * 根据省市区的代号查询对应的名称
     * @param code 代号
     * @return 地址详情
     */
    DistrictEntity findByCode(String code);

    /**
     * 查询地址信息的抽象方法
     * @param parent 查询条件
     * @return 一个具体地址信息的集合
     */
    List<DistrictEntity> findByParent(String parent);
}

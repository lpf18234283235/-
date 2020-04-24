package com.test.service;

public interface ScoreService {
    /**
     * 积分增加
     * @param openId
     * @param scoreValue
     */
    void scoreAdd(String openId,Integer scoreValue);

    /**
     * 积分兑换
     * @param openId
     * @param scoreValue
     */
    void scoreReduce(String openId, Integer scoreValue);

    /**
     * 获取指定用户的积分总额
     * @param openId
     * @return
     */
    Integer getScore(String openId);
}

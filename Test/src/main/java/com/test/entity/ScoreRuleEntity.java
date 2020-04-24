package com.test.entity;

public class ScoreRuleEntity {
    private Integer id;
    private Integer scoreValue;
    private  Integer money;

    public Integer getId() {
        return id;
    }

    public ScoreRuleEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getScoreValue() {
        return scoreValue;
    }

    public ScoreRuleEntity setScoreValue(Integer scoreValue) {
        this.scoreValue = scoreValue;
        return this;
    }

    public Integer getMoney() {
        return money;
    }

    public ScoreRuleEntity setMoney(Integer money) {
        this.money = money;
        return this;
    }

    @Override
    public String toString() {
        return "ScoreRuleEntity{" +
                "id=" + id +
                ", scoreValue=" + scoreValue +
                ", money=" + money +
                '}';
    }
}

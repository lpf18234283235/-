package com.test.entity;

public class ScoreMinValueEntity {
    private Integer id;
    private Integer minValue;
    private Integer money;

    public Integer getId() {
        return id;
    }

    public ScoreMinValueEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public ScoreMinValueEntity setMinValue(Integer minValue) {
        this.minValue = minValue;
        return this;
    }

    public Integer getMoney() {
        return money;
    }

    public ScoreMinValueEntity setMoney(Integer money) {
        this.money = money;
        return this;
    }

    @Override
    public String toString() {
        return "ScoreMinValueEntity{" +
                "id=" + id +
                ", minValue=" + minValue +
                ", money=" + money +
                '}';
    }
}

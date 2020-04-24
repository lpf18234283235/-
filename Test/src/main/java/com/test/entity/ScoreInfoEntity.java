package com.test.entity;

public class ScoreInfoEntity extends BaseEntity{
    private Integer id;
    private String info;
    private Integer scoreValue;

    public Integer getId() {
        return id;
    }

    public ScoreInfoEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public ScoreInfoEntity setInfo(String info) {
        this.info = info;
        return this;
    }

    public Integer getScoreValue() {
        return scoreValue;
    }

    public ScoreInfoEntity setScoreValue(Integer scoreValue) {
        this.scoreValue = scoreValue;
        return this;
    }

    @Override
    public String toString() {
        return "ScoreInfoEntity{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", scoreValue=" + scoreValue +
                '}';
    }
}

package com.test.entity;


public class TSql extends BaseEntity{
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSqlName() {
        return sqlName;
    }
    public void setSqlName(String sqlName) {
        this.sqlName = sqlName;
    }

    public String getSqlType() {
        return sqlType;
    }
    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }
    private Integer id;
    public String getSqlText() {
        return sqlText;
    }
    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }
    private String sqlName;//sqlname 为调用的SQL脚本的名称
    private String sqlText;//sqltext 保存脚本
    private String sqlType;//sqltype 类型(select ,update,insert,delete)
    @Override
    public String toString() {
        return "TSql [id=" + id + ", sqlName=" + sqlName + ", sqlText=" + sqlText + ", sqlType=" + sqlType + "]";
    }



}

